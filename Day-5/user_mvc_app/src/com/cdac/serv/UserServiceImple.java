package com.cdac.serv;

import java.util.List;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImple;
import com.cdac.dto.User;

public class UserServiceImple implements UserService {
	private UserDao userDao;

	@Override
	public void createUser(User user) {
		userDao = new UserDaoImple();
		userDao.insertUser(user);
	}
	
	@Override
	public boolean login(User user) {
		userDao = new UserDaoImple();
		boolean flag = userDao.login(user);
		return flag;
	}
	
	@Override
	public List<User> userList() {
		userDao = new UserDaoImple();
		List<User> l = userDao.selectAllUsers();
		return l;
	}
	
	@Override
	public void removeUser(int userId) {
		userDao = new UserDaoImple();
		userDao.deleteUser(userId);
		
	}
	
	@Override
	public User getUserById(int userId) {
		userDao = new UserDaoImple();
		User user = userDao.getUserById(userId);
		return user;
	}
	
	@Override
	public void modifyUser(User user) {
		userDao = new UserDaoImple();
		userDao.updateUser(user);	
	}
	
}
