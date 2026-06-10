package com.mcc.ai.config;

import com.alibaba.cloud.ai.dashscope.api.DashScopeApi;
import com.alibaba.cloud.ai.dashscope.chat.DashScopeChatModel;
import com.alibaba.cloud.ai.dashscope.chat.DashScopeChatOptions;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LLMConfig {
    @Bean(name = "deepseek")
    public ChatModel deepseek() {
        return DashScopeChatModel.builder()
                .dashScopeApi(
                        DashScopeApi.builder()
                                .apiKey(System.getenv("DASHSCOPE_API_KEY"))
                                .build()
                )
                .defaultOptions(
                        DashScopeChatOptions.builder()
                                .withModel("deepseek-v3.2")
                                .build()
                )
                .build();
    }

    @Bean(name = "qwen")
    public ChatModel qwen() {
        return DashScopeChatModel.builder()
                .dashScopeApi(
                        DashScopeApi.builder()
                                .apiKey(System.getenv("DASHSCOPE_API_KEY"))
                                .build()
                )
                .defaultOptions(
                        DashScopeChatOptions.builder()
                                .withModel("qwen3-max")
                                .build()
                )
                .build();
    }

    @Bean
    public ChatClient chatClient(@Qualifier("dashScopeChatModel")ChatModel dashScopeChatModel){
        return ChatClient.builder(dashScopeChatModel).build();
    }
}
