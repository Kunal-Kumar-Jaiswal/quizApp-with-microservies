package com.quizapp.QuizService.entitity;

import lombok.Data;

@Data
public class Question {
    private long questionId;
    private String questionTitle;
    private long quizId;
}
