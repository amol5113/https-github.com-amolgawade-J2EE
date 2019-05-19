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

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void save(User user) {
		String q = "insert into user(user_name,user_pass,user_role) values('"+user.getUserName()+"','"+user.getUserPass()+"','"+user.getUserRole()+"')";
		System.out.println(q);
		jdbcTemplate.update(q);
	}
	
	public void deleteById(int userId) {
		String q = "delete from user where user_id = "+userId;
		System.out.println(q);
		jdbcTemplate.update(q);
	}
	
	public void update(User user) {
		String q = "update user set user_name='"+user.getUserName()+"',user_pass = '"+user.getUserPass()+"', user_role='"+user.getUserRole()+"' where user_id = "+user.getUserId();
		System.out.println(q);
		jdbcTemplate.update(q);
	}
	
	public List<User> getAll() {
		String q = "select * from user";
		System.out.println(q);
		List<User> ul = jdbcTemplate.query(q, new ResultSetExtractor<List<User>>() {

			public List<User> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<User> ulist = new ArrayList<User>();
				while(rs.next()) {
					User user = new User();
					user.setUserId(rs.getInt(1));
					user.setUserName(rs.getString(2));
					user.setUserPass(rs.getString(3));
					user.setUserRole(rs.getString(4));
					ulist.add(user);
				}
				return ulist;
			}
			
		});
		return ul;
	}
	
}
