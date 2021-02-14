package com.codeprism.helloworld.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController{

	@GetMapping("/")
	public String home(){
		return "hello World!";
	}


}
