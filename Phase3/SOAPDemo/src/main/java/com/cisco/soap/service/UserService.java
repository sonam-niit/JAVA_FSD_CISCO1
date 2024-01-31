package com.cisco.soap.service;

import com.cisco.soap.model.User;

public interface UserService {

	public boolean registerUser(User user);
	public boolean loginUser(User user);
	public boolean deleteUser(String userEmail);
	public boolean updateUser(User user);
	public User getUser(String userEmail);
	public User[] getUsers();
}
