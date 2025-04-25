package com.pawan.command_line_runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SecondRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Second to run!");
	}
	
}
