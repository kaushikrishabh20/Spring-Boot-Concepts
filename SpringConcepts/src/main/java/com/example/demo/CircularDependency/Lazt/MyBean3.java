package com.example.demo.CircularDependency.Lazt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MyBean3 {

	/**********************************************Lazy tech*********************/
	
	@Autowired
	public MyBean4 mybean4;
	
	public String printMessageFromMyBean4() {
		return mybean4.getMessage();
	}
}
