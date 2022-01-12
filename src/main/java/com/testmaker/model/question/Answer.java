package com.testmaker.model.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testmaker.model.AbstractBaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Answer")
@Table(name = "answer")
@Getter
@Setter
public class Answer extends AbstractBaseEntity {

    private String body;

    @Column(name = "is_right")
    private boolean isRight;

    @JsonIgnore
    public boolean isRight() {
        return isRight;
    }
}
