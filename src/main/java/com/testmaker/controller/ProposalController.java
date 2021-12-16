package com.testmaker.controller;

import com.testmaker.model.proposal.Proposal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz/{quizId}/proposal")
public class ProposalController {

    @GetMapping
    public List<Proposal> getProposals(@PathVariable Long quizId) {
        return null;
    }

    @PostMapping
    public Proposal addProposal(@PathVariable Long quizId, Proposal proposal) {
        return null;
    }

    @GetMapping("/{proposalId}")
    public Proposal getProposal(@PathVariable Long proposalId) {
        return null;
    }

    @DeleteMapping("/{proposalId}")
    public Proposal deleteProposal(@PathVariable Long proposalId) {
        return null;
    }

    @PutMapping("/{proposalId}")
    public Proposal updateProposal(@PathVariable Long proposalId, Proposal proposal) {
        return null;
    }

    @PatchMapping("/{proposalId}/accept")
    public Proposal acceptProposal(@PathVariable Long proposalId) {
        return null;
    }

    @PatchMapping("/{proposalId}/decline")
    public Proposal declineProposal(@PathVariable Long proposalId) {
        return null;
    }

}
