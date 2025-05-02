package com.pawan.spring_boot_learnings.beans.manualbeans.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	private BCryptPasswordEncoder passwordEncoder;
	
	public UserService(BCryptPasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}
	
	public String encodePassword(String rawPassword) {
		String encodedPassword = passwordEncoder.encode(rawPassword);   // encodes the raw password
		return encodedPassword;
	}
	
	public boolean verifyPassword(String rawPassword, String encodedPassword) {
		return passwordEncoder.matches(rawPassword, encodedPassword);   // returns true if the raw password is matched with the encoded password, else returns false
	}
}
