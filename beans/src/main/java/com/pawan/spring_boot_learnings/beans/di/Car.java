package com.pawan.spring_boot_learnings.beans.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private final Engine engine;   // Dependent on Engine
	
	@Autowired     // @Autowired for constructor injection only required for Spring versions lower than 4.3
	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Engine dependency injected.");
	}
	
	public String drive() {
		return engine.start() + " Car is moving!";
	}
	
}
