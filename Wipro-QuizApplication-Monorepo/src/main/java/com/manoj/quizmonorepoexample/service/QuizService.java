package com.manoj.quizmonorepoexample.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.manoj.quizmonorepoexample.entities.Question;
import com.manoj.quizmonorepoexample.entities.QuestionWrapper;
import com.manoj.quizmonorepoexample.entities.Quiz;
import com.manoj.quizmonorepoexample.entities.Response;
import com.manoj.quizmonorepoexample.repos.QuestionRepository;
import com.manoj.quizmonorepoexample.repos.QuizRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizService {

	private final QuizRepository quizRepository;
	private final QuestionRepository questionRepository;

	
	public Quiz createQuiz(String category, String level,  String title) {
	    List<Question> questions = questionRepository.findRandomQuestionsByCategoryAndLevel(category, level);

	    Quiz quiz = new Quiz();
	    quiz.setTitle(title);
	    quiz.setQuestions(questions);

	    return quizRepository.save(quiz);
	}




	    public List<QuestionWrapper> getQuizQuestions(Integer id) {
	    	
	    	//getting all questions for quiz
	        Optional<Quiz> quiz = quizRepository.findById(id);
	        
	        
	       List<Question> questionsFromDB = quiz.get().getQuestions();
	       
	        List<QuestionWrapper> questionsForUser = new ArrayList<>();
	        for(Question q : questionsFromDB){
	            QuestionWrapper qw = new QuestionWrapper(q.getQuestionID(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
	            questionsForUser.add(qw);
	        }

	        return questionsForUser;

	    }



		
	    public Integer calculateResult(int id, List<Response> responses) {
	        Quiz quiz = quizRepository.findById(id).get();
	        List<Question> questions = quiz.getQuestions();
	        int rightAnswerScore = 0;

	        for (Response response : responses) {
	            for (Question question : questions) {
	                if (question.getQuestionID() == response.getId()) {
	                    if (question.getCorrectAnswer().equalsIgnoreCase(response.getResponse())) {
	                    	rightAnswerScore++;
	                    }
	                    break; // no need to keep checking once matched
	                }
	            }
	        }

	        return rightAnswerScore;
	    }
	
	
}
