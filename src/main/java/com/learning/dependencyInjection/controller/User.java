package com.learning.dependencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//field injection

@RestController
@RequestMapping(value="/api")
public class User {
//	Order order1=new OnlineOrder();
//	Order order2=new OfflineOrder();
	
	
	@Qualifier("onlineOrderObject")
	@Autowired
	Order order;
	
	public User() {
		System.out.println("User intialized");
	}
	
	//http:localhost:8080/api/fetchOrder
	@GetMapping("/fetchOrder")
	public ResponseEntity<String> createOrder(){
		order.createOrder();
		
		 return ResponseEntity.status(HttpStatus.OK).body("");
	}
	
//	public User(Order OrderObj) {
//		System.out.println("User Intialized 1");
//		this.order=OrderObj;
//	}
//	

}
