package com.cdac.serv;

import java.util.List;

import com.cdac.dto.User;

public interface UserService {
	void createUser(User user);
	void removeUser(int userId);
	void modifyUser(User user);
	List<User> userList();
	boolean login(User user);
	User getUserById(int userId);
}
