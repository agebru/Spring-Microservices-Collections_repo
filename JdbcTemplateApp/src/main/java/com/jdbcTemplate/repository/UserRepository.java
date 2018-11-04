package com.jdbcTemplate.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.jdbcTemplate.model.User;

@Repository
public class UserRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public List<User> findAll(){
		return jdbcTemplate.query("select *from users", new UserRowMapper());
	}
	
	public User findById(int userId) {
		return jdbcTemplate.queryForObject("select *from users where id=?",
				new Object[] {userId},new UserRowMapper());
	}
	
	
	public User createUser(final User user) {
		final String sql = "insert into users(name,email) values(?,?)";
		KeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
				    ps.setString(1, user.getName());
	                ps.setString(2, user.getEmail());
	                return ps;
			}
		},holder);
		
		
		int newUserid=holder.getKey().intValue();
		user.setId(newUserid);
		return user;
		
	
	}
	
	
	
	

}
