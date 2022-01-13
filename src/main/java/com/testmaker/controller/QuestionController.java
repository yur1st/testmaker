package com.testmaker.controller;

import com.testmaker.model.dto.question.QuestionDto;
import com.testmaker.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/quiz/{quizId}/question")
public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping
    public Collection<QuestionDto> getQuestions(@PathVariable Long quizId) {

        return service.getQuestions(quizId);
    }

    @PostMapping
    public QuestionDto addQuestion(@PathVariable Long quizId, @RequestBody QuestionDto questionDto) {

        return service.addQuestion(quizId, questionDto);
    }

    @PutMapping("/{questionId}")
    public QuestionDto updateQuestion(@PathVariable Long quizId, @PathVariable Long questionId, @RequestBody QuestionDto questionDto) {

        return service.updateQuestion(quizId, questionId, questionDto);
    }

    @DeleteMapping("/{questionId}")
    public String deleteQuestion(@PathVariable Long questionId) {

        return service.deleteQuestion(questionId);
    }

    @GetMapping("/{questionId}")
    public QuestionDto getQuestion(@PathVariable Long questionId) {

        return service.getQuestion(questionId);
    }

}
