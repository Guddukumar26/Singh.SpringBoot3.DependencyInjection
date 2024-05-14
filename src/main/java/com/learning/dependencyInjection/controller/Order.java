package com.learning.dependencyInjection.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Lazy
//@Component
//public class Order {
//	public Order() {
//		System.out.println("Order Intialized");
//	}
//}


public interface Order {
	public void createOrder();
}
