package com.cisco.ums.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
		List<User> list=null;
		try {
			list=new ArrayList<User>();
			Connection conn= DBConfig.getConnection();
			String query="select * from user";
			Statement stmt= conn.createStatement();
			ResultSet result=stmt.executeQuery(query);
			while(result.next()) {
				User user= new User();
				user.setId(result.getInt(1));
				user.setName(result.getString(2));
				user.setEmail(result.getString(3));
				user.setCountry(result.getString(4));
				list.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public User getUserById(int id) {
		User u= null;
		String query="Select * from user where id=?";
		try(Connection conn= DBConfig.getConnection();
				PreparedStatement stmt= 
						conn.prepareStatement(query)) {
			
			stmt.setInt(1, id);
			ResultSet result= stmt.executeQuery();
			if(result.next()) {
				u= new User();
				u.setId(result.getInt(1));
				u.setName(result.getString(2));
				u.setEmail(result.getString(3));
				u.setCountry(result.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public User updateUser(User user, int id) {
		User resp=null;
		String query="update user set name=?, country=? where id=?";
		try(Connection conn= DBConfig.getConnection();
				PreparedStatement stmt= 
						conn.prepareStatement(query)) {
			
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getCountry());
			stmt.setInt(3, id);
			
			int x=stmt.executeUpdate();
			if(x>0) {
				resp= getUserById(id);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public boolean deleteUser(int id) {
		boolean resp=false;
		String query="delete from user where id=?";
		try(Connection conn= DBConfig.getConnection();
				PreparedStatement stmt= 
						conn.prepareStatement(query)) {
			
			if(getUserById(id)!=null) {
				stmt.setInt(1, id);
				if(stmt.executeUpdate()>0) {
					resp=true;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resp;
	}

}
