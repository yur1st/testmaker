package com.testmaker.model.question;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.testmaker.model.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Answer")
@Table(name = "answer")
@Data
public class Answer extends AbstractBaseEntity {

    private String body;

    @Column(name = "is_right")
    private boolean isRight;

    @JsonBackReference
    public boolean isRight() {
        return isRight;
    }
}
