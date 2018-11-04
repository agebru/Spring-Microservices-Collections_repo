package com.client.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.client.model.Order;
import com.client.repository.OrderRepository;

@RestController
public class OrderController {
	
	@Autowired
	private Environment env;
	
	@RequestMapping(value="/orders",method=RequestMethod.GET)
	public List<Order> findAll(){
		return OrderRepository.getOrders();
	}
	
	@RequestMapping(value="/orders/{orderId}",method=RequestMethod.GET)
	public Order findone(@PathVariable("orderId") int orderId){
		return OrderRepository.getOne(orderId);
	}
	
	@GetMapping("/")
	public String home() {
		return "you are pinging: "+env.getRequiredProperty("local.server.port");
	}

}
