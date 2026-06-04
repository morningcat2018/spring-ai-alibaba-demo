package com.mcc.ai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /*
     * 对话模型，调用阿里云百炼平台
     * ChatModel 所有大模型聊天的总的父接口,支持文本聊天交互模型*/
    @Autowired
    private ChatModel chatModel;

    // http://localhost:8081/hello/dochat
    @GetMapping(value = "/hello/dochat")
    public String doChat(@RequestParam(name = "question", defaultValue = "你是谁") String question) {
        String result = chatModel.call(question);
        return result;
    }

}
