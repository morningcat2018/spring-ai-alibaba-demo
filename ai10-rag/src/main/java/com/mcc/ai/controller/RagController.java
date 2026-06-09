package com.mcc.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.rag.advisor.RetrievalAugmentationAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class RagController {
    @Autowired
    private ChatClient chatClient;

    @Autowired
    private RetrievalAugmentationAdvisor retrievalAugmentationAdvisor;

//    http://localhost:8090/chat?message=罗兰
    @GetMapping("/chat")
    public Flux<String> chat(@RequestParam(value = "message") String message) {
        Flux<String> resp = chatClient.prompt()
                .user(message)
                .advisors(retrievalAugmentationAdvisor)
                .stream()
                .content();

        return resp.doOnNext(item -> System.out.print(item));
    }
}


