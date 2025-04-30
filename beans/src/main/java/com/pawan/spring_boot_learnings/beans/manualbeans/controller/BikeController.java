package com.pawan.spring_boot_learnings.beans.manualbeans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.spring_boot_learnings.beans.manualbeans.core.Bike;

@RestController
public class BikeController {
	@Autowired
	private Bike bike;
	
	@GetMapping("/ride")
	public String rideBike() {
		bike.ride();
		return "Bike is on the move!";
	}
}
