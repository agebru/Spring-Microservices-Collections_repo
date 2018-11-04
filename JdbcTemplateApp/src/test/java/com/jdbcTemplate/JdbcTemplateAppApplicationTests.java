package com.jdbcTemplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jdbcTemplate.model.User;
import com.jdbcTemplate.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTemplateAppApplicationTests {

	@Autowired
    private UserRepository userRepository;
	
	
	@Test
    public void findAllUsers() {
        List<User> users = userRepository.findAll();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }
	
	@Test
    public void findUserById() {
        User user = userRepository.findById(1);
        assertNotNull(user);
    }
	
	@Test
    public void createUser() {
        User user = new User(0, "John", "john@gmail.com");
        User savedUser = userRepository.createUser(user);
        User newUser = userRepository.findById(savedUser.getId());
        assertNotNull(newUser);
        assertEquals("John", newUser.getName());
        assertEquals("john@gmail.com", newUser.getEmail());
    }
	
	
	
	
}
