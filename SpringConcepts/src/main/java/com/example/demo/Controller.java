package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CircularDependency.Lazt.MyBean3;
import com.example.demo.CircularDependency.PostConstruct.MyBean;

@RestController
public class Controller {

	@Autowired
	public MyBean myBean;
	
	@Autowired
	public MyBean3 myBean3;
	
	@GetMapping("/hello")
	public String message() {
		return(myBean.printMessageFromBean2());
	}
	
	
	@GetMapping("/helloLazy")
	public String messageLazy() {
		return(myBean3.printMessageFromMyBean4());
	}
	
}
