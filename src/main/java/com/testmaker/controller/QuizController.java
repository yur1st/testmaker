package com.testmaker.controller;

import com.testmaker.model.Quiz;
import com.testmaker.model.dto.QuizAnswersDto;
import com.testmaker.model.dto.QuizDto;
import com.testmaker.model.dto.QuizListDto;
import com.testmaker.model.dto.ResultDto;
import com.testmaker.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<QuizListDto> getAllQuizzes() {
        return new ArrayList<>(quizService.getAll());
    }

    @PostMapping
    public QuizDto addQuiz(@RequestBody QuizDto quiz) {

        return quizService.addQuiz(quiz);
    }

    @GetMapping("/{quizId}")
    public QuizDto getQuiz(@PathVariable Long quizId) {

        return quizService.getById(quizId);
    }

    @PostMapping("/{quizId}")
    public ResultDto checkAnswers(@PathVariable Long quizId, QuizAnswersDto answers) {
        return null;
    }

    @PutMapping("/{quizId}")
    public QuizDto updateQuiz(@PathVariable Long quizId, QuizDto quiz) {
        return quizService.updateQuiz(quizId, quiz);
    }

    @DeleteMapping("/{quizId}")
    public Quiz deleteQuiz(@PathVariable Long quizId) {
        return null;
    }


}
