package com.jdbcTemplate;

import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbcTemplate.service.TestClass;
@RestController
@SpringBootApplication
//@EntityScan("com.jdbcTemplate.model")
public class JdbcTemplateAppApplication {
	
	@Autowired
	private  TestClass testClass;
	
	
	private static TestClass staticField;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcTemplateAppApplication.class, args);
		
		
		System.out.println("All Bean Definitions " );
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		
		/*for(String bean:beanDefinitionNames) {
			System.out.println(bean);
		}*/
		
		
		// creating an object of static field
		
		System.out.println(" \nCall using Static Field: "+staticField.display());
		
		
		
		
		
	}
	
	@PreDestroy
	public void displayBeforeBeanCreationStarted() {
		System.out.println("\n Before any bean is started...\n");
	}
	
	@PostConstruct
	private void init() {
		staticField=this.testClass;
	}
	
	
	@GetMapping("/test")
	public String showMessage() {
		return testClass.display();
	}	
	
	
	
}
