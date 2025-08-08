package com.manoj.quizmonorepoexample.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.manoj.quizmonorepoexample.entities.Question;
import com.manoj.quizmonorepoexample.enums.Category;
import com.manoj.quizmonorepoexample.exception.UserNotFoundException;
import com.manoj.quizmonorepoexample.repos.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getQuestionsByCategory(Category category) {
        return questionRepository.findByCategory(category);
    }

    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Page<Question> getAll(Pageable pageable) {
        return questionRepository.findAll(pageable);
    }

    public Question getById(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Question not found with id: " + id));
    }

    public Question update(Long id, Question updatedQuestion) {
        Question existing = questionRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Question not found with id: " + id));

        existing.setQuestionTitle(updatedQuestion.getQuestionTitle());
        existing.setOption1(updatedQuestion.getOption1());
        existing.setOption2(updatedQuestion.getOption2());
        existing.setOption3(updatedQuestion.getOption3());
        existing.setOption4(updatedQuestion.getOption4());
        existing.setCorrectAnswer(updatedQuestion.getCorrectAnswer());
        existing.setDifficultyLevel(updatedQuestion.getDifficultyLevel());
        existing.setCategory(updatedQuestion.getCategory());

        return questionRepository.save(existing);
    }
}
