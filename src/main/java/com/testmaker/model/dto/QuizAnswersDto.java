package com.testmaker.model.dto;

import com.testmaker.model.question.Answer;
import lombok.Data;

import java.util.Map;

@Data
public class QuizAnswersDto {

    private Long quizId;

    private Map<Long, Answer> answers;


}
