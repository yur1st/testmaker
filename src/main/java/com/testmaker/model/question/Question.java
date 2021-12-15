package com.testmaker.model.question;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testmaker.model.AbstractBaseEntity;
import com.testmaker.model.Quiz;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Question")
@Table(name = "question")
@Data
public class Question extends AbstractBaseEntity {

    private String body;
    private QuestionType type;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Answer> answers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Quiz quiz;

}
