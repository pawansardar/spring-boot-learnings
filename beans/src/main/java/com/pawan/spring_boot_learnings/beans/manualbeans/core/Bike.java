package com.pawan.spring_boot_learnings.beans.manualbeans.core;

//Not a bean. Registered as a bean through BikeConfig at runtime.
public class Bike {
	private FuelTank fuelTank;
	
	public Bike(FuelTank fuelTank) {
		this.fuelTank = fuelTank;
		System.out.println("Bike created!");
	}
	public void ride() {
		fuelTank.fill();
		System.out.println("Bike is ready to ride...");
	}
}
