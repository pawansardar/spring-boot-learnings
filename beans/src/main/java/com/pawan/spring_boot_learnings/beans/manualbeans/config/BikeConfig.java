package com.pawan.spring_boot_learnings.beans.manualbeans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pawan.spring_boot_learnings.beans.manualbeans.core.Bike;
import com.pawan.spring_boot_learnings.beans.manualbeans.core.FuelTank;

@Configuration
public class BikeConfig {
	
	@Bean
	public FuelTank fuelTank() {     // Registers FuelTank as a bean
		return new FuelTank();
	}
	
	@Bean
	public Bike bike() {     // Registers Bike as a bean
		return new Bike(fuelTank());
	}
	
}
