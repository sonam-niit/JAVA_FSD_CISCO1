package com.cisco.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String greeting() {
		return "Good AfterNoon..!!";
	}
	
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable String name) {
		return "Welcome "+name;
	}
}
