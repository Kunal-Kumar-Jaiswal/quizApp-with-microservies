package com.quizapp.ApiGateway.controller;

import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/health-check")
    public String healthCheck() {
        return "This is test";
    }
}
