package com.testmaker.model.dto;

import com.testmaker.model.proposal.ProposalStatus;
import com.testmaker.model.question.Question;
import lombok.Data;

@Data
public class ProposalDto {

    private Question question;
    private ProposalStatus status;

    private Long userId;
    private String userName;

    private Long quizId;
    private String quizName;
}
