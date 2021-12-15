package com.testmaker.controller;

import com.testmaker.model.question.Question;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz/{quizId}/question")
public class QuestionController {

    @GetMapping
    public List<Question> getQuestions(@PathVariable Long quizId) {
        return null;
    }

    @PostMapping
    public Question addQuestion(@PathVariable Long quizId, Question question) {
        return null;
    }

    @PutMapping("/{questionId}")
    public Question updateQuestion(@PathVariable Long questionId, Question question) {
        return null;
    }

    @DeleteMapping("/{questionId}")
    public Question deleteQuestion(@PathVariable Long questionId) {
        return null;
    }

    @GetMapping("/{quiestionId}")
    public Question getQuestion(@PathVariable Long questionId) {
        return null;
    }

}
