package com.learning.dependencyInjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("onlineOrderObject")
public class OnlineOrder implements Order{
	public  OnlineOrder() {
		System.out.println("Intialized Online Order");
	}
	
	public void createOrder() {
		System.out.println("Online order");
	}

}
