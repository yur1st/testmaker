package com.testmaker.mapping;

import com.testmaker.model.dto.ProposalDto;
import com.testmaker.model.proposal.Proposal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface ProposalMapper {

    Proposal proposalFromDto(ProposalDto dto);

    Collection<Proposal> proposalListFromDto(Collection<Proposal> dtos);

    @Mapping(target = "userId", expression = "java(proposal.getUser().getId())")
    @Mapping(target = "userName", expression = "java(proposal.getUser().getName())")
    @Mapping(target = "quizId", expression = "java(proposal.getQuiz().getId())")
    @Mapping(target = "quizName", expression = "java(proposal.getQuiz().getName())")
    ProposalDto proposalToDto(Proposal proposal);

    Collection<ProposalDto> proposalListToDto(Collection<Proposal> proposals);
}
