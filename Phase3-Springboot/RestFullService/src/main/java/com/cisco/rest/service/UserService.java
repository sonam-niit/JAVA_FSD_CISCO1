package com.cisco.rest.service;

import java.util.List;

import com.cisco.rest.model.User;

public interface UserService {

	public User addUser(User user);
	public List<User> getAllUsers();
	public User getUserById(Long id);
	public void deleteUserById(Long id);
	public User updateUserById(User user,Long id);
}
