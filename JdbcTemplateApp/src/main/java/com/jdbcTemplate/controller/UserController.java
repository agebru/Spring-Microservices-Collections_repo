package com.jdbcTemplate.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jdbcTemplate.model.User;
import com.jdbcTemplate.service.UserService;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.BeanUtils;


@RestController
public class UserController {

	
	private static Logger logger=Logger.getLogger(UserController.class.getName());	

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.findAll();
	}
	
	@GetMapping("/users/{userId}")
	public User findOne(@PathVariable("userId") int userId) {
		return userService.findById(userId);
	}
	
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	

	@RequestMapping(value="/add-user",method = RequestMethod.POST)
	public ResponseEntity<User> add(@RequestBody User user) {
	    logger.info(String.format("UserService createUser method : %s for %s", userService.getClass().getName(), user.getName()));
	    logger.info("Logger Name: "+logger.getName());
	    System.out.println(user);
	    
	    User newUser = new User();
	    BeanUtils.copyProperties(user, newUser);
	    try {
	    	userService.createUser(newUser);
	    } catch (Exception ex) {
	        logger.log(Level.WARNING, "Exception raised newUser  REST Call {0}", ex);
	        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
	    }
	    return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
