package com.cisco.ums.dao;

import java.util.List;

import com.cisco.ums.model.User;

public interface UserDAO {

	public int createUser(User user);
	public List<User> getAllUsers();
	public User getUserById(int id);
	public User updateUser(User user,int id);
	public boolean deleteUser(int id);
}
