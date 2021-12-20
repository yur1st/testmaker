package com.testmaker.model.dto;

import com.testmaker.model.question.Answer;
import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
public class QuizAnswersDto {

    private Long quizId;

    private Map<Long, Set<Answer>> answers;   //answerId , List of Answers


}
