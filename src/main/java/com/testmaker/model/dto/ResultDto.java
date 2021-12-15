package com.testmaker.model.dto;

import com.testmaker.model.Quiz;
import com.testmaker.model.question.Question;
import lombok.Data;

import java.util.Map;

@Data
public class ResultDto {

    private Quiz quiz;

    private Map<Question, Boolean> results;


}
