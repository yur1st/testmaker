package com.testmaker.mapping;

import com.testmaker.model.Quiz;
import com.testmaker.model.dto.QuizDto;
import com.testmaker.model.dto.QuizListDto;
import com.testmaker.service.QuestionService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

@Mapper(componentModel = "spring")
public abstract class QuizMapper {

    @Autowired
    protected QuestionService service;

    @Mapping(target = "totalQuestions", expression = "java(service.getTotalQuestions(quiz.getId()))")
    public abstract QuizListDto quizToQuizDtoInList(Quiz quiz);

    public abstract Collection<QuizListDto> quizToQuizList(Collection<Quiz> quiz);

    public abstract QuizDto quizToQuizDtoIndividual(Quiz quiz);

    public abstract void updateQuizFromQuizDto(QuizDto dto, @MappingTarget Quiz quiz);

    public abstract Quiz quizDtoToQuizIndividual(QuizDto quiz);
}
