package com.testmaker.model.proposal;

import com.testmaker.model.AbstractBaseEntity;
import com.testmaker.model.question.Question;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "proposal")
@Getter
@Setter
public class Proposal extends AbstractBaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    private Question question;

    @Enumerated(value = EnumType.STRING)
    private ProposalStatus status;

}
