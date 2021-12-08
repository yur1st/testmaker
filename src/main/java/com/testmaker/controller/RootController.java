package com.testmaker.controller;

import com.testmaker.model.Quiz;
import com.testmaker.service.QuestionService;
import com.testmaker.service.QuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RootController {

    private final QuizService quizService;
    private final QuestionService questionService;

    public RootController(QuizService quizService, QuestionService questionService) {
        this.quizService = quizService;
        this.questionService = questionService;
    }

    @GetMapping("/quiz")
    public List<Quiz> getAllQuizes() {
        return new ArrayList<>(quizService.getAll());
    }

    @GetMapping("/quiz/{questionId}/{answerId}")
    public boolean checkAnswer(@PathVariable Long questionId, @PathVariable Long answerId) {
        return questionService.checkAnswer(questionId, answerId);
    }

}
