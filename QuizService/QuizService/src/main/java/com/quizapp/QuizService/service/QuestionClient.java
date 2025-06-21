package com.quizapp.QuizService.service;

import com.quizapp.QuizService.entitity.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:8081", value = "Question-Client")
@FeignClient(name = "QUESTIONSERVICE")
public interface QuestionClient {
    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionsByQuizId(@PathVariable long quizId);
}
