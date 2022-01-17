package com.testmaker.mapping;

import com.testmaker.model.dto.ProposalDto;
import com.testmaker.model.proposal.Proposal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import javax.persistence.Tuple;
import java.util.Collection;
import java.util.LinkedList;

@Mapper(componentModel = "spring")
public abstract class ProposalMapper {

    public abstract Proposal proposalFromDto(ProposalDto dto);

    public abstract Collection<Proposal> proposalListFromDto(Collection<Proposal> dtos);

    @Mapping(target = "userId", expression = "java(proposal.getUser().getId())")
    @Mapping(target = "userName", expression = "java(proposal.getUser().getName())")
    @Mapping(target = "quizId", expression = "java(proposal.getQuiz().getId())")
    @Mapping(target = "quizName", expression = "java(proposal.getQuiz().getName())")
    public abstract ProposalDto proposalToDto(Proposal proposal);

    public Collection<ProposalDto> proposalTupleListToDto(Collection<Tuple> tuples) {
        LinkedList<ProposalDto> proposalDtos = new LinkedList<>();
        for (Tuple tuple : tuples) {
            ProposalDto dto = new ProposalDto(tuple.get("question_id", Long.class),
                    tuple.get("status", String.class),
                    tuple.get("user_id", Long.class),
                    tuple.get("q.name", String.class),
                    tuple.get("quiz_id", Long.class),
                    tuple.get("u.name", String.class));
            proposalDtos.add(dto);
        }
        return proposalDtos;

    }


}
