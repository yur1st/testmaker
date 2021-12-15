package com.testmaker.model;

import com.testmaker.model.question.Question;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Proposal extends AbstractBaseEntity {

    @OneToOne
    private Question question;

    @OneToOne
    private Quiz quiz;

    private int status;

}
