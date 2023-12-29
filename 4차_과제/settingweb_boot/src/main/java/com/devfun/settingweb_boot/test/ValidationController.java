package com.devfun.settingweb_boot.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ValidationController {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exception() {
		return ResponseEntity
				.badRequest()
				.build();
	}
}
