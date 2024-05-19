package com.example.demo.CircularDependency.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MyBean2 {

	public MyBean myBean;
	
	public void setMyBean(MyBean myBean) {
		this.myBean = myBean;
	}

	public String getMessage() {
		return "Hello There";
	}
	
}
