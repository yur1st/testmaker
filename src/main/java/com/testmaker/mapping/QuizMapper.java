package com.testmaker.mapping;

import com.testmaker.model.Quiz;
import com.testmaker.model.dto.QuizListDto;
import com.testmaker.service.QuestionService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

@Mapper(componentModel = "spring")
public abstract class QuizMapper {

    @Autowired
    protected QuestionService service;

    @Mapping(target = "totalQuestions", expression = "java(service.getTotalQuestions(quiz.getId()))")
    public abstract QuizListDto quizToQuizDto(Quiz quiz);

    public abstract Collection<QuizListDto> quizToQuizList(Collection<Quiz> quiz);
}
