package com.quizapp.QuizService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz-test")
public class QuizControllerTest {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "this is test health check";
    }
}
