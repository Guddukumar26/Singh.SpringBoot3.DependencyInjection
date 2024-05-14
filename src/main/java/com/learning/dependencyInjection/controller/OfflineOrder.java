package com.learning.dependencyInjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("offlineOrderObject")
@Component
public class OfflineOrder implements Order {
	
	public OfflineOrder() {
		System.out.println("intialized offline Order");
	}
	
	public void createOrder() {
		System.out.println("Offline order");
	}

}
