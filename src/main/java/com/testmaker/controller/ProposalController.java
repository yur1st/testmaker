package com.testmaker.controller;

import com.testmaker.model.dto.ProposalDto;
import com.testmaker.service.ProposalService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/quiz/{quizId}/proposal")
public class ProposalController {

    private final ProposalService service;

    public ProposalController(ProposalService service) {
        this.service = service;
    }

    @GetMapping
    public Collection<ProposalDto> getProposals(@PathVariable Long quizId) {
        return service.getProposals(quizId);
    }

    @PostMapping
    public ProposalDto addProposal(@PathVariable Long quizId, ProposalDto proposalDto) {
        return null;
    }

    @GetMapping("/{proposalId}")
    public ProposalDto getProposal(@PathVariable Long proposalId) {
        return service.getProposal(proposalId);
    }

    @DeleteMapping("/{proposalId}")
    public String deleteProposal(@PathVariable Long proposalId) {
        return service.deleteProposal(proposalId);
    }

    @PutMapping("/{proposalId}")
    public ProposalDto updateProposal(@PathVariable Long proposalId, ProposalDto proposalDto) {
        return null;
    }

    @PatchMapping("/{proposalId}/accept")
    public ProposalDto acceptProposal(@PathVariable Long proposalId) {
        return null;
    }

    @PatchMapping("/{proposalId}/decline")
    public ProposalDto declineProposal(@PathVariable Long proposalId) {
        return null;
    }

}
