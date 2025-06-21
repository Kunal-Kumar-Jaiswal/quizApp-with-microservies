package com.quizapp.QuizService.controller;

import com.quizapp.QuizService.entitity.Quiz;
import com.quizapp.QuizService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/health-check")
    public String healthCheck() {
        return "This is health check";
    }

    @PostMapping("/create")
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.add(quiz);
    }

    @GetMapping("/all-quiz")
    public List<Quiz> getAllQuiz() {
        return quizService.getAllQuiz();
    }

    @GetMapping("{quizId}")
    public Quiz getQuizById(@PathVariable long quizId) {
        return quizService.getQuizById(quizId);
    }

}
