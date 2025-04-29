package com.pawan.spring_boot_learnings.beans.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanScope {
	
	@Autowired
	private SingletonBean singletonBean1;
	
	@Autowired
	private SingletonBean singletonBean2;
	
	@Autowired
	private ApplicationContext context;
	
	@GetMapping("/test")
	public String test() {
		System.out.println("singletonBean1: " + singletonBean1);
		System.out.println("singletonBean2: " + singletonBean2);
		System.out.println(singletonBean1 == singletonBean2);     // true
		
		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1 == prototypeBean2);     // false
		
		return "Prototype beans created";
	}
	
}
