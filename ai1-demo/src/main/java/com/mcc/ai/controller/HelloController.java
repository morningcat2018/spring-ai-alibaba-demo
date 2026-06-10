package com.mcc.ai.controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    /*
     * 对话模型，调用阿里云百炼平台
     * ChatModel 所有大模型聊天的总的父接口,支持文本聊天交互模型*/
    @Autowired
    @Qualifier("deepseek")
    private ChatModel chatModel;

    @Autowired
    private ChatClient chatClient;

    // http://localhost:8081/hello/dochat
    @GetMapping(value = "/hello/dochat")
    public String doChat(@RequestParam(name = "question", defaultValue = "你是谁") String question) {
        String result = chatModel.call(question);
        System.out.println(chatModel.getDefaultOptions().getModel());
        return result;
    }

    // http://localhost:8081/hello/streamchat?question=%E5%A6%82%E4%BD%95%E6%B7%B1%E5%85%A5%E5%AD%A6%E4%B9%A0kafka
    @GetMapping(value = "/hello/streamchat")
    public Flux<String> stream(@RequestParam(name = "question", defaultValue = "你是谁") String question) {
        System.out.println(chatModel.getDefaultOptions().getModel());
        return chatModel.stream(question);
    }

    // http://localhost:8081/chatclient/dochat?msg=%E4%BD%A0%E5%A5%BD
    @GetMapping("/chatclient/dochat")
    public String doChat2(@RequestParam(name = "msg", defaultValue = "你是谁") String question) {
        String result = chatClient.prompt()
                .system("你作为一个专业的软件工程师,只能回答计算机相关的知识")
                .user(question)
                .call()
                .content();
        //        System.out.println("ChatClient响应：" + result);
        return result;
    }

    /**
     * 提示词模版
     * http://localhost:8081/prompttemplate/chat?
     *
     * @param candidateName
     * @param jobPosition
     * @param entryDate
     * @param salaryRange
     * @param welfare
     * @param companyName
     * @param offerType
     * @return
     */
    @GetMapping("/prompttemplate/chat")
    public Flux<String> template(@RequestParam(name = "candidateName", defaultValue = "张三") String candidateName,
                                 @RequestParam(name = "jobPosition", defaultValue = "Java工程师") String jobPosition,
                                 @RequestParam(name = "entryDate", defaultValue = "2026年7月1日") String entryDate,
                                 @RequestParam(name = "salaryRange", defaultValue = "20K") String salaryRange,
                                 @RequestParam(name = "welfare", defaultValue = "五险一金") String welfare,
                                 @RequestParam(name = "companyName", defaultValue = "尘茂集团") String companyName,
                                 @RequestParam(name = "offerType", defaultValue = "正式员工") String offerType) throws IOException {

        /*
         * String systemTemplateStr = """...""";
         * 是 Java 15 及以上版本 引入的「文本块（Text Blocks）」语法，
         * 核心作用是简化多行字符串的编写，解决传统字符串拼接 / 转义的痛点，
         * 让代码中的长文本、多行文本更易读、易维护。
         */
        // ========== 1. System提示词模板（包含占位符） ==========
        ClassPathResource systemTemplateFile = new ClassPathResource("prompts/system.txt");
        String systemTemplateStr = new String(
                systemTemplateFile.getInputStream().readAllBytes(),
                StandardCharsets.UTF_8
        );

        // 2. 创建System模板对象，填充System侧的变量
        PromptTemplate systemPromptTemplate = new PromptTemplate(systemTemplateStr);
        Map<String, Object> systemVariables = Map.of(
                "companyName", companyName,  // 企业名称（动态）
                "offerType", offerType      // Offer类型（如"正式员工"/"实习生"）
        );
        // 渲染System模板，得到填充后的完整System提示词
        SystemMessage systemMessage = new SystemMessage(systemPromptTemplate.render(systemVariables));

        // ========== 2. User提示词模板（原有逻辑不变） ==========
        ClassPathResource userTemplateFile = new ClassPathResource("prompts/user.txt");
        String userTemplateStr = new String(
                userTemplateFile.getInputStream().readAllBytes(),
                StandardCharsets.UTF_8
        );
        PromptTemplate userPromptTemplate = new PromptTemplate(userTemplateStr);
        Map<String, Object> userVariables = Map.of(
                "candidateName", candidateName,
                "jobPosition", jobPosition,
                "entryDate", entryDate,
                "salaryRange", salaryRange,
                "welfare", welfare
        );
        UserMessage userMessage = new UserMessage(userPromptTemplate.render(userVariables));

        // ========== 3. 组合消息并调用大模型 ==========
        Prompt prompt = new Prompt(List.of(systemMessage, userMessage));

        // 4. 调用阿里云大模型，获取结果
        return chatClient.prompt(prompt)
                .stream()
                .content();
    }
}
