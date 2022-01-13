package com.testmaker.mapping;

import com.testmaker.model.dto.question.QuestionDto;
import com.testmaker.model.question.Question;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    QuestionDto questionToDto(Question question);

    Collection<QuestionDto> questionListToDto(Collection<Question> questions);

    Question questionFromDto(QuestionDto dto);

    Collection<Question> questionListFromDto(Collection<QuestionDto> dtos);

}
