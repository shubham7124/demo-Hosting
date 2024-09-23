package com.sample.deployment.deployment_project.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserController {
	
	private Map<String, String> users= new HashMap<>();
	
	@GetMapping("/hello")
	public ResponseEntity<String>tMethodName() {
		return new ResponseEntity<String>("Hello Wolrd",HttpStatus.OK);
	}
	
	
	

}
