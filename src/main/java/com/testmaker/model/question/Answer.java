package com.testmaker.model.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testmaker.model.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Answer")
@Table(name = "answer")
@Data
public class Answer extends AbstractBaseEntity {

    private String body;
    private boolean isRight;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    private Question question;

    @JsonIgnore
    public boolean isRight() {
        return isRight;
    }
}
