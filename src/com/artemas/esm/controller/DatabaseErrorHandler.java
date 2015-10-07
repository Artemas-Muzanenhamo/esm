package com.artemas.esm.controller;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DatabaseErrorHandler {
	
	@ExceptionHandler(DataAccessException.class) //handle database related exceptions...
	public String handleDatabaseException(DataAccessException ex){
		return "error";
	}

}
