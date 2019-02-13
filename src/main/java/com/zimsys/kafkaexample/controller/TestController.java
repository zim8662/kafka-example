package com.zimsys.kafkaexample.controller;

import com.zimsys.kafkaexample.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private SenderService senderService;

    @GetMapping("/test")
    public void test() {
        senderService.send("Test test test...");
    }
}
