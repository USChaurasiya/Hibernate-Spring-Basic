package com.uma.Model;

public class Bus implements Vehicle
{

	private int  maxSpeed;
	@Override
	public void move() 
	{
		System.out.println("Max Speed:"+getMaxSpeed());
		System.out.println("Bus Started..");
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
