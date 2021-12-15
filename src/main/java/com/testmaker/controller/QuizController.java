package com.testmaker.controller;

import com.testmaker.model.Quiz;
import com.testmaker.model.QuizAnswers;
import com.testmaker.model.Result;
import com.testmaker.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("/quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return new ArrayList<>(quizService.getAll());
    }

    @PostMapping
    public Quiz addQuiz(Quiz quiz) {
        return null;
    }

    @GetMapping("/{quizId}")
    public Quiz getQuiz(@PathVariable Long quizId) {
        return null;
    }

    @PostMapping("/{quizId}")
    public Result checkAnswers(@PathVariable Long quizId, QuizAnswers answers) {
        return null;
    }

    @PutMapping("/{quizId}")
    public Quiz updateQuiz(@PathVariable Long quizId, Quiz quiz) {
        return null;
    }

    @DeleteMapping("/{quizId}")
    public Quiz deleteQuiz(@PathVariable Long quizId) {
        return null;
    }


}
