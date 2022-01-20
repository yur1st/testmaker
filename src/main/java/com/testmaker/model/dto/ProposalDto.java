package com.testmaker.model.dto;

import com.testmaker.model.proposal.ProposalStatus;
import lombok.Data;

@Data
public class ProposalDto {

    private Long proposalId;

    private Long questionId;
    private ProposalStatus status;

    private Long userId;
    private String userName;

    private Long quizId;
    private String quizName;

    public ProposalDto(Long questionId, String status, Long userId, String userName, Long quizId, String quizName) {
    }

    public ProposalDto() {

    }
}
