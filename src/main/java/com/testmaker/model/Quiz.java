package com.testmaker.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity(name = "Quiz")
@Table(name = "quiz")
@Data
public class Quiz extends AbstractBaseEntity {

    private String name;
    private String description;
    private int questionsNumber;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> questions;

}
