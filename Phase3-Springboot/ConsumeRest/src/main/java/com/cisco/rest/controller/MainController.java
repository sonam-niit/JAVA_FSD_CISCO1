package com.cisco.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cisco.rest.model.User;

@RestController
public class MainController {

//	@Autowired
	RestTemplate restTemplate= new RestTemplate();
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id) {
	return restTemplate.getForObject
			("https://jsonplaceholder.typicode.com/users/"+id,User.class);
	}
}
