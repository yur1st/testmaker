package com.testmaker.service;

import com.testmaker.mapping.ProposalMapper;
import com.testmaker.model.dto.ProposalDto;
import com.testmaker.model.proposal.Proposal;
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
        return mapper.proposalTupleListToDto(repository.findAllProposalsByQuizId(quizId));
    }

    public ProposalDto getProposal(Long proposalId) {
        return mapper.proposalToDto(repository.findById(proposalId));
    }

    public String deleteProposal(Long proposalId) {
        Proposal proposal = repository.findById(proposalId);
        repository.delete(proposalId);
        return String.format("Proposal №%d: \"%s\" is successfully deleted.", proposal.getId(), proposal.getQuestion().getBody());
    }
}
