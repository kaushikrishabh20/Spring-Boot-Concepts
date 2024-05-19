package com.example.demo.CircularDependency.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MyBean {

	/**********************************************Post construct tech*********************/
	
	@Autowired
	public MyBean2 myBean2;
	
	@PostConstruct
	public void init() {
		myBean2.setMyBean(this);
	}
	
	public String printMessageFromBean2() {
		return myBean2.getMessage();
	}
	
}
