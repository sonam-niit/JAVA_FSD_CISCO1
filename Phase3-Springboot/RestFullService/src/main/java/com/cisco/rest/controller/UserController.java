package com.cisco.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.rest.model.User;
import com.cisco.rest.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@DeleteMapping("{id}")
	public ResponseEntity<Object> deleteUserById(@PathVariable Long id){
		if(service.getUserById(id)!=null) {
			service.deleteUserById(id);
			return new ResponseEntity<Object>("User Deleted with Id "+id,HttpStatus.OK);
		}else
			return new ResponseEntity<Object>("No User found to delete with ID "+id,HttpStatus.NOT_FOUND);
	}
	@PutMapping("{id}")
	public ResponseEntity<Object> updateUserById(@RequestBody User user,@PathVariable(name = "id") Long id){
		User updatedUser= service.updateUserById(user, id);
		if(updatedUser!=null)
			return new ResponseEntity<Object>("User updated Successfully",HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No User found to update",HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Object> getUserById(@PathVariable Long id){
		User foundUser= service.getUserById(id);
		if(foundUser!=null)
			return new ResponseEntity<Object>(foundUser,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No User found with Id "+id,HttpStatus.NOT_FOUND);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<List<User>>(service.getAllUsers(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> addUser(@RequestBody User user){
		User createdUser=service.addUser(user);
		if(createdUser!=null)
			return new ResponseEntity<Object>(createdUser,HttpStatus.CREATED);
		else
			return new ResponseEntity<Object>("Error while creating User",
					HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
}
