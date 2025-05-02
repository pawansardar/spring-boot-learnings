package com.pawan.spring_boot_learnings.beans.manualbeans.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.spring_boot_learnings.beans.manualbeans.service.UserService;

// A simple example of a manual bean using password encoder without the database connection
@RestController
public class UserController {
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("encodePassword")
	public String encodePassword(@RequestBody String rawPassword) {
		return userService.encodePassword(rawPassword);
	}
	
	@PostMapping("verifyPassword")
	public boolean verifyPassword(@RequestParam String rawPassword, @RequestParam String encodedPassword) {
		return userService.verifyPassword(rawPassword, encodedPassword);
	}
}
