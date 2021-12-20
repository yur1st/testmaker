package com.testmaker.model.question;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.testmaker.model.AbstractBaseEntity;
import com.testmaker.model.Quiz;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Question")
@Table(name = "question")
@Data
public class Question extends AbstractBaseEntity {

    private String body;

    @Enumerated(value = EnumType.STRING)
    private QuestionType type;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "question_id")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id")
    private Set<Answer> answers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Quiz quiz;

}
