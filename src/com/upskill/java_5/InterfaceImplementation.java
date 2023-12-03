package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		System.out.println("My car has 2 door");
		
	}

	@Override
	public void iWheel() {
		System.out.println("My car has 3 Wheel");
		
	}

	@Override
	public void iEngine() {
		System.out.println("My car has 1 Engine");
		
	}

	@Override
	public int iSail() {
		System.out.println("My car has 2 Sail");
		
		return 2;
	}

	@Override
	public String iCabin() {
		System.out.println("My car has AC Cabin");
		
		return "AC";
	}
	
	

}
