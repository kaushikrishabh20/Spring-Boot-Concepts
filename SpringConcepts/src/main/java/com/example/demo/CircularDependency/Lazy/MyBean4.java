package com.example.demo.CircularDependency.Lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MyBean4 {

	@Autowired
	@Lazy
	public MyBean3 mybean3;
	
	
	public String getMessage() {
		return "Hello There while checking for lazy";
	}
	
}
