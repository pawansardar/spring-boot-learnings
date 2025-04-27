package com.pawan.spring_boot_learnings.beans.di;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public String start() {
		return "Engine started!";
	}
	
}
