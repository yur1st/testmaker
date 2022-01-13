package com.testmaker.service;

import com.testmaker.mapping.QuestionMapper;
import com.testmaker.model.Quiz;
import com.testmaker.model.dto.question.QuestionDto;
import com.testmaker.model.question.Question;
import com.testmaker.repository.QuestionRepository;
import com.testmaker.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final QuizRepository quizRepository;
    private final QuestionMapper mapper;

    public QuestionService(QuestionRepository questionRepository, QuizRepository quizRepository, QuestionMapper mapper) {
        this.questionRepository = questionRepository;
        this.quizRepository = quizRepository;
        this.mapper = mapper;
    }

    public int getTotalQuestions(Long quizId) {
        return questionRepository.getTotalQuestions(quizId);
    }

    public Collection<QuestionDto> getQuestions(Long quizId) {
        Quiz quiz = quizRepository.findById(quizId);
        return mapper.questionListToDto(quiz.getQuestions());
    }


    public QuestionDto addQuestion(Long quizId, QuestionDto questionDto) {
        Question question = mapper.questionFromDto(questionDto);
        question.setQuiz(quizRepository.findById(quizId));
        questionRepository.save(question);
        return mapper.questionToDto(question);
    }

    public QuestionDto updateQuestion(Long quizId, Long questionId, QuestionDto questionDto) {
        Question question = mapper.questionFromDto(questionDto);
        question.setQuiz(quizRepository.findById(quizId));
        if (questionDto.getId() == questionId) {
            return mapper.questionToDto(questionRepository.save(question));
        }
        return null;
    }

    public String deleteQuestion(Long questionId) {
        Question question = questionRepository.findById(questionId);
        questionRepository.delete(questionId);
        return String.format("Question №%d: \"%s\" is successfully deleted.", question.getId(), question.getBody());
    }

    public QuestionDto getQuestion(Long questionId) {
        return mapper.questionToDto(questionRepository.findById(questionId));
    }
}
