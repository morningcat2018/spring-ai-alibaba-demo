package com.mcc.ai.config;

import io.milvus.client.MilvusServiceClient;
import io.milvus.grpc.GetCollectionStatisticsResponse;
import io.milvus.param.R;
import io.milvus.param.collection.FlushParam;
import io.milvus.param.collection.GetCollectionStatisticsParam;
import io.milvus.response.GetCollStatResponseWrapper;
import jakarta.annotation.PostConstruct;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.document.Document;
import org.springframework.ai.rag.advisor.RetrievalAugmentationAdvisor;
import org.springframework.ai.rag.generation.augmentation.ContextualQueryAugmenter;
import org.springframework.ai.rag.retrieval.search.VectorStoreDocumentRetriever;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.milvus.MilvusVectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.util.List;


@Configuration
public class LLMConfig {

    @Autowired
    private MilvusVectorStore vectorStore;

    @Value("${spring.ai.vectorstore.milvus.collection-name}")
    private String collectionName;

    @Bean
    public ChatClient chatClient(ChatModel dashscopeChatModel) {
        return ChatClient.builder(dashscopeChatModel).build();
    }


    @Bean
    public RetrievalAugmentationAdvisor retrievalAugmentationAdvisor() {

        VectorStoreDocumentRetriever retriver = VectorStoreDocumentRetriever.builder()
                .vectorStore(vectorStore)
                .similarityThreshold(0.2)
                .topK(6)
                .build();

        ContextualQueryAugmenter cqa = ContextualQueryAugmenter.builder()
                .allowEmptyContext(true)
                .build();

        return RetrievalAugmentationAdvisor.builder()
                .documentRetriever(retriver)
                .queryAugmenter(cqa)
                .build();
    }


    @PostConstruct
    public void initVectorData() throws TikaException, IOException {
        System.out.println("初始化向量数据，写入到Milvus 中...");

        //获取 Milvus 客户端
        MilvusServiceClient client = (MilvusServiceClient) vectorStore.getNativeClient().get();

        //先获取 collection 数据条数，如果大于0 ，就不再写入，否则写入
        R<GetCollectionStatisticsResponse> resp = client.getCollectionStatistics(
                GetCollectionStatisticsParam.newBuilder()
                        .withCollectionName(collectionName)
                        .build());
        long rowCount = new GetCollStatResponseWrapper(resp.getData()).getRowCount();
        System.out.println("milvus vector store 中的数量：" + rowCount);

        if (rowCount < 1) {
            System.out.println("milvus 中没有数据，需要写入数据");

            //加载文档数据到向量数据库
            loadAndStoreDocumentData();

            client.flush(FlushParam.newBuilder()
                    .withCollectionNames(List.of(collectionName))
                    .build());

        }
    }

    /**
     * 读取文档内容存入 Milvus 中
     */
    private void loadAndStoreDocumentData() throws IOException, TikaException {

        ClassPathResource resource = new ClassPathResource("放开那个女巫.txt");

        Tika tika = new Tika();
        String text = tika.parseToString(resource.getFile());

        //拆分文档，写入向量数据库
        //使用TokenTextSplitter 拆分文本
        TokenTextSplitter splitter = TokenTextSplitter.builder()
                .withChunkSize(800)
                .withMinChunkSizeChars(400)
                .withKeepSeparator(true)
                .build();

        List<Document> chunks = splitter.apply(List.of(new Document(text)));

        //写入向量数据库
        vectorStore.add(chunks);
    }
}
