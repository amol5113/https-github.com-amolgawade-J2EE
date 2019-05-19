package com.cdac.springsetterdiapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.cdac.springsetterdiapp.dto.User;

public interface UserDao {	
	public void save(User user);	
	public void deleteById(int userId);	
	public void update(User user) ;
	public List<User> getAll() ;
	
}
