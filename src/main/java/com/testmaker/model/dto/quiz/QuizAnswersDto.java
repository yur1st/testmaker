package com.testmaker.model.dto.quiz;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
public class QuizAnswersDto {

    @JsonProperty("id")
    private Long quizId;

    @JsonProperty("answers")
    private Map<Long, Set<Long>> answers;   //questionId , List of AnswersId


}
