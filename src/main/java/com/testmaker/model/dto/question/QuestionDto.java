package com.testmaker.model.dto.question;

import com.testmaker.model.question.Answer;
import com.testmaker.model.question.QuestionType;
import lombok.Data;

import java.util.Set;

@Data
public class QuestionDto {

    private Long id;
    private String body;
    private QuestionType type;
    private Set<Answer> answers;
}
