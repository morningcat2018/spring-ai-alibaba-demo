package com.mcc.ai.controller;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class HelloController {
    /*
     * 对话模型，调用阿里云百炼平台
     * ChatModel 所有大模型聊天的总的父接口,支持文本聊天交互模型*/
    @Autowired
    @Qualifier("dashscopeChatModel")
    private ChatModel chatModel;

    @Autowired
    private ChatClient chatClient;

    // http://localhost:8081/hello/dochat
    @GetMapping(value = "/hello/dochat")
    public String doChat(@RequestParam(name = "question", defaultValue = "你是谁") String question) {
        String result = chatModel.call(question);
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
}
