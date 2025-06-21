package com.quizapp.QuestionService.service.impl;

import com.quizapp.QuestionService.entitity.Question;
import com.quizapp.QuestionService.repository.QuestionRepository;
import com.quizapp.QuestionService.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(long questionId) {
        return questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("Question not found !!"));
    }

    @Override
    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getQuestionsByQuizId(long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
