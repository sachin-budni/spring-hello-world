package com.org.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	@GetMapping("/")
	public String getString() {
		return "<h1>Hello World</h1>";
	}
}
