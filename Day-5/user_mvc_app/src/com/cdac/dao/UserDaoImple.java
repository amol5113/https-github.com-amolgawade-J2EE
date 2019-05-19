package com.cdac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cdac.conn.MyConn;
import com.cdac.dto.User;

public class UserDaoImple implements UserDao {
	private MyConn mcon;
	@Override
	public void insertUser(User user) {
		try {
			mcon = new MyConn();
			Connection con = mcon.getMyConn();
			PreparedStatement s = con.prepareStatement(
					"insert into user(user_name,user_pass,user_role) values(?,?,?)");
			s.setString(1, user.getUserName());
			s.setString(2, user.getUserPass());
			s.setString(3, user.getUserRole());
			int i = s.executeUpdate();
	//		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
	}
	
	@Override
	public boolean login(User user) {
		boolean flag = false;
		try {
			mcon = new MyConn();
			Connection con = mcon.getMyConn();
			PreparedStatement s = con.prepareStatement(
					"select * from user where user_name = ? and user_pass = ?");
			s.setString(1, user.getUserName());
			s.setString(2, user.getUserPass());
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				flag = true;
			}
			rs.close();
	//		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return flag;
	}
	
	
	@Override
	public List<User> selectAllUsers() {
		List<User> ulist = new ArrayList<User>();
		try {
			mcon = new MyConn();
			Connection con = mcon.getMyConn();
			PreparedStatement s = con.prepareStatement(
					"select * from user");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				User u = new User();
				u.setUserId(rs.getInt(1));
				u.setUserName(rs.getString(2));
				u.setUserPass(rs.getString(3));
				u.setUserRole(rs.getString(4));
				ulist.add(u);
			}
			rs.close();
	//		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return ulist;

	}
	
	@Override
	public void deleteUser(int userId) {
		int i = 0;
		try {
			mcon = new MyConn();
			Connection con = mcon.getMyConn();
			PreparedStatement s = con.prepareStatement(
					"delete from user where user_id = ?");
			s.setInt(1, userId);
			i = s.executeUpdate();
	//		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
	}
	
	@Override
	public User getUserById(int userId) {
		User u = new User();
		try {
			mcon = new MyConn();
			Connection con = mcon.getMyConn();
			PreparedStatement s = con.prepareStatement(
					"select * from user where user_id = ?");
			s.setInt(1, userId);
			ResultSet rs = s.executeQuery();
			if(rs.next()) {				
				u.setUserId(rs.getInt(1));
				u.setUserName(rs.getString(2));
				u.setUserPass(rs.getString(3));
				u.setUserRole(rs.getString(4));			
			}
			rs.close();
	//		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		return u;
	}
	
	@Override
	public void updateUser(User user) {
		try {
			mcon = new MyConn();
			Connection con = mcon.getMyConn();
			PreparedStatement s = con.prepareStatement(
					"update user set user_name = ?,user_pass = ?,user_role = ? where user_id = ?");
			s.setString(1, user.getUserName());
			s.setString(2, user.getUserPass());
			s.setString(3, user.getUserRole());
			s.setInt(4, user.getUserId());
			int i = s.executeUpdate();
	//		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
	}
	
}
