package com.vijay.rating.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vijay.rating.Exception.ResourceNotFound;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<Map<String,Object>> HandlerResourceNotFoundException(ResourceNotFound ex){
		Map<String,Object> map=new HashMap<>();
		map.put("message",ex.getMessage());
		map.put("success", true);
		map.put("status",HttpStatus.NOT_FOUND);
		
				
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		
	}

}
