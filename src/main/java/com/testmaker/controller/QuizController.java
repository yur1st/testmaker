package com.testmaker.controller;

import ch.qos.logback.classic.Logger;
import com.testmaker.model.dto.QuizAnswersDto;
import com.testmaker.model.dto.QuizDto;
import com.testmaker.model.dto.QuizListDto;
import com.testmaker.model.dto.ResultDto;
import com.testmaker.service.QuizService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService quizService;

    private Logger logger = (Logger) LoggerFactory.getLogger(QuizController.class);

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
    public ResultDto checkAnswers(@PathVariable Long quizId, @RequestBody QuizAnswersDto answers) {

        return quizService.checkAnswers(quizId, answers);
    }

    @PutMapping("/{quizId}")
    public QuizDto updateQuiz(@PathVariable Long quizId, @RequestBody QuizDto quizDto) {
        logger.debug("putting quizDto");
        return quizService.updateQuiz(quizId, quizDto);
    }

    @DeleteMapping("/{quizId}")
    public String deleteQuiz(@PathVariable Long quizId) {

        return quizService.deleteQuiz(quizId);
    }


}
