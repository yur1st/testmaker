package com.testmaker.model.proposal;

import com.testmaker.model.AbstractBaseEntity;
import com.testmaker.model.question.Question;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Entity
public class Proposal extends AbstractBaseEntity {

    @OneToOne
    private Question question;

    @Enumerated(value = EnumType.STRING)
    private ProposalStatus status;

}
