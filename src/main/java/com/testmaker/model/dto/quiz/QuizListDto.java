package com.testmaker.model.dto.quiz;

import lombok.Data;

@Data
public class QuizListDto {

    private Long id;
    private String name;
    private String description;
    private int questionsNumber;
    private int totalQuestions;

}
