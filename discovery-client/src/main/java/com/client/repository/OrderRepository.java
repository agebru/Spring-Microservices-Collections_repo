package com.client.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.client.model.Order;

public class OrderRepository {

	public static Map<Integer,Order> ordersMap;
	static {
		ordersMap=new HashMap<Integer,Order>();
		ordersMap.put(1, new Order(111,"Keyboard",100.0));
		ordersMap.put(2, new Order(222,"Computer Mouse",25.0));
		ordersMap.put(3, new Order(333,"CellPhone",650.0));
		ordersMap.put(4, new Order(444,"Laptop",999.0));
		ordersMap.put(5, new Order(555,"table",65.0));
		
	}
	
	
	
	public static List<Order> getOrders(){
		return new ArrayList<>(ordersMap.values());
	}
	
	public static Order getOne(int orderId) {
		Order order=null;
		Set<Integer> keysets=ordersMap.keySet();
		for(Integer i:keysets) {
			order=ordersMap.get(i);
			if(order.getOrderId()==orderId) {
				return order;
			}
					}
		 throw new IllegalArgumentException();
	}
}
