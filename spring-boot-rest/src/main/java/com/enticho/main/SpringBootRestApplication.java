package com.enticho.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages= {"com.enticho"})
public class SpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}
}
