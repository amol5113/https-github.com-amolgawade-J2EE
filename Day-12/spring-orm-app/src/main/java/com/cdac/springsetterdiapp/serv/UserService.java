package com.cdac.springsetterdiapp.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.springsetterdiapp.dao.UserDao;
import com.cdac.springsetterdiapp.dto.User;

public interface UserService {	
	public void createUser(User user);
	public void removeUser(int userId);
	public void modifyUser(User user);
	public List<User> selectAllUsers();
}

