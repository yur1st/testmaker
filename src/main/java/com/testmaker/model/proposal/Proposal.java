package com.testmaker.model.proposal;

import com.testmaker.model.AbstractBaseEntity;
import com.testmaker.model.Quiz;
import com.testmaker.model.question.Question;
import com.testmaker.model.user.User;

import javax.persistence.*;

@Entity
public class Proposal extends AbstractBaseEntity {

    @OneToOne
    private Question question;

    @ManyToOne(fetch = FetchType.LAZY)
    private Quiz quiz;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @Enumerated(value = EnumType.STRING)
    private ProposalStatus status;

}
