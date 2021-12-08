package com.testmaker.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Answer")
@Table(name = "answer")
public class Answer extends AbstractBaseEntity {

    private String body;
    private boolean isRight;

    public Answer() {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }
}
