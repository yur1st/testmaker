package com.testmaker.model.dto.quiz;

import com.testmaker.model.Quiz;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class ResultDto {

    private Quiz quiz;

    private Map<Long, Boolean> results = new LinkedHashMap<>();

    public ResultDto(Quiz quiz) {
        this.quiz = quiz;
    }
}
