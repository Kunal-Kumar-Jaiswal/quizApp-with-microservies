package com.quizapp.QuizService.service.impl;

import com.quizapp.QuizService.entitity.Quiz;
import com.quizapp.QuizService.repository.QuizRepository;
import com.quizapp.QuizService.service.QuestionClient;
import com.quizapp.QuizService.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionClient questionClient;

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getAllQuiz() {
        List<Quiz> quizzes = quizRepository.findAll();
        return quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionsByQuizId(quiz.getQuizId()));
            return quiz;
        }).toList();
    }

    @Override
    public Quiz getQuizById(long quizId) {
        Quiz quiz = quizRepository.findById(quizId).orElseThrow(() -> new RuntimeException("Quiz id is not found !!"));
        quiz.setQuestions(questionClient.getQuestionsByQuizId(quizId));
        return quiz;
    }
}
