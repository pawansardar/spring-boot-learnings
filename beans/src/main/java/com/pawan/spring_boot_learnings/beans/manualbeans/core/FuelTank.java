package com.pawan.spring_boot_learnings.beans.manualbeans.core;

// Not a bean. Registered as a bean through BikeConfig at runtime.
public class FuelTank {
	public FuelTank() {
		System.out.println("Fuel tank created!");
	}
	public void fill() {
		System.out.println("Fuel tank filled up...");
	}
}
