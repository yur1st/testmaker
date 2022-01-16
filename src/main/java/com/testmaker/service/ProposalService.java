package com.testmaker.service;

import com.testmaker.mapping.ProposalMapper;
import com.testmaker.model.dto.ProposalDto;
import com.testmaker.repository.ProposalRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProposalService {

    private final ProposalRepository repository;

    private final ProposalMapper mapper;


    public ProposalService(ProposalRepository repository, ProposalMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Collection<ProposalDto> getProposals(Long quizId) {
        return mapper.proposalListToDto(repository.findAllByQuizId(quizId));
    }
}
