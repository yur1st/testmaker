package com.testmaker.service;

import com.testmaker.model.Question;
import com.testmaker.model.QuestionType;
import com.testmaker.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public boolean checkAnswer(Long questionId, Long answerId) {
        Question question = questionRepository.findById(questionId);
        if (question.getType() == QuestionType.ONE) {
            return question.getAnswers().stream()
                    .filter(answer -> answer.getId() == answerId)
                    .findFirst().orElseThrow().isRight();
        }
        return false;
    }
}
