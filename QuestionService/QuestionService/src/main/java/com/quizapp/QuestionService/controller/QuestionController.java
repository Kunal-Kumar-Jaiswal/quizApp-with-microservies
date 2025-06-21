package com.quizapp.QuestionService.controller;

import com.quizapp.QuestionService.entitity.Question;
import com.quizapp.QuestionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/health-check")
    public String healthCheck() {
        return "This is health check";
    }

    @PostMapping("create")
    public Question createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{questionId}")
    public Question getQuestionById(@PathVariable long questionId) {
        return questionService.getQuestionById(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsByQuizId(@PathVariable long quizId) {
        return questionService.getQuestionsByQuizId(quizId);
    }

}
