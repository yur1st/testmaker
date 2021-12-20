package com.testmaker.model.dto;

import com.testmaker.model.Quiz;
import lombok.Data;

import java.util.Map;

@Data
public class ResultDto {

    private Quiz quiz;

    private Map<Long, Boolean> results;

    public ResultDto(Quiz quiz) {
        this.quiz = quiz;
    }
}
