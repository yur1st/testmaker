package com.testmaker.model.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.testmaker.model.question.Question;
import lombok.Data;

import java.util.List;

@Data
public class QuizDto {

    private Long id;
    private String name;
    private String description;
    private int questionsNumber;

    @JsonManagedReference
    private List<Question> questions;

}
