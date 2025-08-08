package com.manoj.quizmonorepoexample.controller;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.quizmonorepoexample.entities.Question;
import com.manoj.quizmonorepoexample.enums.Category;
import com.manoj.quizmonorepoexample.service.QuestionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/question")
@RequiredArgsConstructor
public class QuestionController {

	
	private final QuestionService questionService;

	@GetMapping
    public Page<Question> getAll(Pageable pageable) {
        return questionService.getAll(pageable);
    }
	
	@GetMapping("/{id}")
    public Question getById(@PathVariable Long id) {
        return questionService.getById(id); // Custom exception applied here!
    }
	
	
	@PutMapping("/{id}")
    public Question update(@PathVariable Long id, @RequestBody @Valid Question question) {
        return questionService.update(id, question);
    }
	
	
	
	
    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable Category category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public Question addQuestion(@RequestBody @Valid Question question){
        return  questionService.addQuestion(question);
    }
	
	
}
