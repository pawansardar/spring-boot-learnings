package com.pawan.spring_boot_learnings.beans.manualbeans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig {
	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		System.out.println("passwordEncoder bean created");
		return new BCryptPasswordEncoder();
	}
}
