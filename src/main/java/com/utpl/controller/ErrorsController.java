package com.utpl.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.utpl.constant.ViewConstant;

//@ControllerAdvice
public class ErrorsController {
	// El error 400 por defecto ya se coge por configuracion ya que existe la carpeta error
	
	//@ExceptionHandler(Exception.class)
	public String showInternalError() {
		return ViewConstant.ERROR;
	}
}
