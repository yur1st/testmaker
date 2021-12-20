package com.testmaker.model.question;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testmaker.model.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "Answer")
@Table(name = "answer")
@Data
public class Answer extends AbstractBaseEntity {

    private String body;

    @Column(name = "is_right")
    private boolean isRight;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    private Question question;

    @JsonIgnore
    public boolean isRight() {
        return isRight;
    }
}
