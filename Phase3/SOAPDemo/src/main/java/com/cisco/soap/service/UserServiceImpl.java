package com.cisco.soap.service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import com.cisco.soap.model.User;

public class UserServiceImpl implements UserService {
	
	static LinkedHashMap<String, User> users=new LinkedHashMap<String, User>();

	@Override
	public boolean registerUser(User user) {
		if(user.getEmail().isEmpty()||user.getPassword().isEmpty()) {
			return false;
		}else {
			users.put(user.getEmail(), user);
		}
		return true;
	}
	@Override
	public boolean loginUser(User user) {
		User userToCheck=users.get(user.getEmail());
		return userToCheck.getPassword().equals(user.getPassword());
	}
	@Override
	public boolean deleteUser(String userEmail) {
		if(!users.containsKey(userEmail)) {
			return false;
		}
		users.remove(userEmail);
		return true;
	}
	@Override
	public boolean updateUser(User user) {
		if(!users.containsKey(user.getEmail())) {
			return false;
		}
		users.put(user.getEmail(), user);
		return true;
	}
	@Override
	public User getUser(String userEmail) {
		if(!users.containsKey(userEmail)) {
			return null;
		}else {
			return users.get(userEmail);
		}
	}
	@Override
	public User[] getUsers() {
		User[] userArray= new User[users.size()];
		Set<String> emails= users.keySet();
		int ind=0;
		Iterator<String> itr= emails.iterator();
		while(itr.hasNext()) {
			String email=itr.next();
			userArray[ind]=users.get(email);
			ind++;
		}
		
		return userArray;
	}

}
