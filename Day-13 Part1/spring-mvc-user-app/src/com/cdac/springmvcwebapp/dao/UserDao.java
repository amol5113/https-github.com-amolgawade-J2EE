package com.cdac.springmvcwebapp.dao;

import java.util.List;

import com.cdac.springmvcwebapp.dto.User;

public interface UserDao {	
	public void save(User user);	
	public void deleteById(int userId);	
	public void update(User user) ;
	public List<User> getAll() ;
	public boolean validateUser(User user);
}
