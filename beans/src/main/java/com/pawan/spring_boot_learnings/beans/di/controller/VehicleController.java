package com.pawan.spring_boot_learnings.beans.di.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pawan.spring_boot_learnings.beans.di.Car;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	private final Car car;   // Dependent on Car
	
	public VehicleController(Car car) {
		this.car = car;
		System.out.println("Car dependency injected.");
	}
	
	@GetMapping("/drive")
	public String driveCar() {
		return car.drive();
	}
	
}
