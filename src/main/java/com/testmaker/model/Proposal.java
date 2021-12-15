package com.testmaker.model;

import com.testmaker.model.question.Question;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Proposal extends AbstractBaseEntity {

    @OneToOne
    private Question question;

    @ManyToOne(fetch = FetchType.LAZY)
    private Quiz quiz;

    private int status;

}
