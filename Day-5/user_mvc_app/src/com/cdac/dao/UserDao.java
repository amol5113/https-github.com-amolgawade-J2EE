package com.cdac.dao;

import java.util.List;

import com.cdac.dto.User;

public interface UserDao {
	void insertUser(User user);
	void deleteUser(int userId);
	void updateUser(User user);
	List<User> selectAllUsers();
	boolean login(User user);
	User getUserById(int userId);
}
