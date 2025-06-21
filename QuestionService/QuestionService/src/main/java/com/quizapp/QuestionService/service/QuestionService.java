package com.quizapp.QuestionService.service;

import com.quizapp.QuestionService.entitity.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAllQuestions();
    Question getQuestionById(long questionId);
    Question createQuestion(Question question);
    List<Question> getQuestionsByQuizId(long quizId);
}
