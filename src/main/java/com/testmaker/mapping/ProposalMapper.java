package com.testmaker.mapping;

import com.testmaker.model.dto.ProposalDto;
import com.testmaker.model.proposal.Proposal;
import com.testmaker.model.proposal.ProposalStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.persistence.Tuple;
import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedList;

@Mapper(componentModel = "spring")
public abstract class ProposalMapper {

    public abstract Proposal proposalFromDto(ProposalDto dto);

    public abstract Collection<Proposal> proposalListFromDto(Collection<Proposal> dtos);

    @Mapping(target = "proposalId", expression = "java(proposal.getId())")
    @Mapping(target = "questionId", expression = "java(proposal.getQuestion().getId())")
    @Mapping(target = "userId", expression = "java(proposal.getUser().getId())")
    @Mapping(target = "userName", expression = "java(proposal.getUser().getName())")
    @Mapping(target = "quizId", expression = "java(proposal.getQuiz().getId())")
    @Mapping(target = "quizName", expression = "java(proposal.getQuiz().getName())")
    public abstract ProposalDto proposalToDto(Proposal proposal);

    public Collection<ProposalDto> proposalTupleListToDto(Collection<Tuple> tuples) {
        LinkedList<ProposalDto> proposalDtos = new LinkedList<>();
        for (Tuple tuple : tuples) {
            ProposalDto dto = new ProposalDto();
            dto.setProposalId(tuple.get("proposal_id", BigInteger.class).longValue());
            dto.setQuestionId(tuple.get("question_id", BigInteger.class).longValue());
            dto.setStatus(ProposalStatus.valueOf(tuple.get("status", String.class)));
            dto.setUserId(tuple.get("user_id", BigInteger.class).longValue());
            dto.setQuizId(tuple.get("quiz_id", BigInteger.class).longValue());
            dto.setQuizName(tuple.get("quiz_name", String.class));
            dto.setUserName(tuple.get("user_name", String.class));
            proposalDtos.add(dto);
        }
        return proposalDtos;

    }


}
