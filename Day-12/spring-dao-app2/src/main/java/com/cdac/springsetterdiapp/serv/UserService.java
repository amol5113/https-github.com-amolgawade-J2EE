package com.cdac.springsetterdiapp.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.springsetterdiapp.dao.UserDao;
import com.cdac.springsetterdiapp.dto.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public void createUser(User user) {
		userDao.save(user);
	}
	
	public void removeUser(int userId) {
		userDao.deleteById(userId);
	}
	
	public void modifyUser(User user) {
		userDao.update(user);
	}
	
	public List<User> selectAllUsers() {
		return userDao.getAll();
	}
}

