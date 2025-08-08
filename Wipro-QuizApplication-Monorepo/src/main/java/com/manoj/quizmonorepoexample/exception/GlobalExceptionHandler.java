package com.manoj.quizmonorepoexample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleUserNotFoundException(UserNotFoundException ex)
	{
		ErrorMessage errrorMessage=new ErrorMessage(ex.getMessage(),"USER_NOT_FOUND_EXCEPTON");
		return new ResponseEntity<>(errrorMessage,HttpStatus.NOT_FOUND);
	}
	
	
	
}
