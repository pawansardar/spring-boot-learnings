package com.pawan.command_line_runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App started successfully...");
	}

}
