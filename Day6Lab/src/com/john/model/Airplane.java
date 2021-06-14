package com.john.model;

public class Airplane extends FlyingVehicle{
	private short wheels;
	private short propellors;
	
	public Airplane(short wheels, short propellors) {
		this.wheels = wheels;
		this.propellors = propellors;
	}
	
	public Airplane() {}
	
	public void turn() {
		System.out.println("Turning...");
	}

	public short getWheels() {
		return wheels;
	}

	public void setWheels(short wheels) {
		this.wheels = wheels;
	}

	public short getPropellors() {
		return propellors;
	}

	public void setPropellors(short propellors) {
		this.propellors = propellors;
	}
	
	
}
