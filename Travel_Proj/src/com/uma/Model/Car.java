package com.uma.Model;

public class Car implements Vehicle
{
	private String fuelType;
	private int maxSpeed;
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	@Override
	public void move() 
	{
		System.out.println("Fuel Type:"+getFuelType());
		System.out.println("Max Speed:"+getMaxSpeed());
		System.out.println("Car Started..");
	}
	
}
