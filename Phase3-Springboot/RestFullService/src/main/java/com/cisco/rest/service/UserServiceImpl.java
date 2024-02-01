package com.cisco.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.rest.model.User;
import com.cisco.rest.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repository;
	@Override
	public User addUser(User user) {
		return repository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return repository.findAll();
	}
	@Override
	public User getUserById(Long id) {
		return repository.findById(id).orElse(null);
//		if(repository.findById(id).isPresent()) {
//			return repository.findById(id).get();
//		}else {
//			return null;
//		}
	}

	@Override
	public void deleteUserById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public User updateUserById(User user, Long id) {
		User existingUser= getUserById(id);
		if(existingUser!=null) {
			existingUser.setName(user.getName());
			existingUser.setCountry(user.getCountry());
			existingUser =repository.save(existingUser);
		}
		return existingUser;
	}

}
