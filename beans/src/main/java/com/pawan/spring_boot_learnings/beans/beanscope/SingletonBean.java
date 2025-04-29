package com.pawan.spring_boot_learnings.beans.beanscope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	
	public SingletonBean() {
		System.out.println("Singleton Bean created");
	}
	
}
