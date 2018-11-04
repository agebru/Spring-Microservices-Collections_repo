package com.jdbcTemplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdbcTemplate.model.User;
import com.jdbcTemplate.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(int userId) {
		return userRepository.findById(userId);
	}
	
	
	public User createUser(final User user) {
				return userRepository.createUser(user);
	}
	

}
