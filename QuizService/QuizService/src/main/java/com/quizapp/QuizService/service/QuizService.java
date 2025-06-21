package com.quizapp.QuizService.service;


import com.quizapp.QuizService.entitity.Quiz;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);
    List<Quiz> getAllQuiz();
    Quiz getQuizById(long quizId);
}
