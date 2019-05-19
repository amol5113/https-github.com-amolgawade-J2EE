package com.cdac.springsetterdiapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cdac.springsetterdiapp.dto.User;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void save(User user) {
		String q = "insert into user(user_name,user_pass,user_role) values(?,?,?)";
		System.out.println(q);
		jdbcTemplate.update(q,new Object[] {user.getUserName(),user.getUserPass(),user.getUserRole()});
	}
	
	public void deleteById(int userId) {
		String q = "delete from user where user_id = ?";
		System.out.println(q);
		jdbcTemplate.update(q, new Object[] {userId});
	}
	
	public void update(User user) {
		String q = "update user set user_name=?, user_pass = ?, user_role= ? where user_id = ?";
		System.out.println(q);
		jdbcTemplate.update(q,new Object[] {user.getUserName(),user.getUserPass(),user.getUserRole(),user.getUserId()});
	}
	
	public List<User> getAll() {
		String q = "select * from user";
		System.out.println(q);
		List<User> ul = jdbcTemplate.query(q, new RowMapper<User>() {
			
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setUserPass(rs.getString(3));
				user.setUserRole(rs.getString(4));
				return user;
			}
		});
		return ul;
	}
	
}
