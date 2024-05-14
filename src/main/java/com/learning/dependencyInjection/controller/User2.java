//package com.learning.dependencyInjection.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
////constructor injection
//
//@Component
//public class User2 {
//	
//	Order order;
//	Invoice invoice;
//	
////	@Autowired  //for single constructor there is no need to used @Autowired
//	public User2(Order order) {
//		System.out.println(" User2 Intialized");
//		this.order=order;
//	}
//	
////	@Autowired
//	public User2(Invoice invoice) {
//		this.invoice=invoice;
//		System.out.println("User2 intialized only with invoice");
//	}
//	
//	@Autowired
//	public User2(Invoice invoice, Order order) {
//		this.invoice=invoice;
//		this.order=order;
//		System.out.println("User2 intialized  with invoice and order both");
//	}
//
//
//}
