package com.cisco.ums.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.cisco.ums.config.DBConfig;
import com.cisco.ums.dao.UserDAO;
import com.cisco.ums.model.User;

public class UserDAOImpl implements UserDAO{

	@Override
	public int createUser(User user) {
		int result=0;
		try {
			Connection conn=DBConfig.getConnection();
			PreparedStatement pst= 
			conn.prepareStatement("insert into user (name,email,country) values (?,?,?)");
			
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getCountry());
			
			result= pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
