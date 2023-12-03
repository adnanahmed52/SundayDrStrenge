package com.upskill.java_5;

public abstract class AbstractClass {
	
	
	/* Abstraction in Java is a process of hiding the implementation details from the user 
	   and showing only the functionality to the user. It can be achieved by using abstract classes,
	   methods, and interfaces. An abstract class is a class that cannot be instantiated on its own 
	   and is meant to be inherited by concrete classes. 
	 */
	
	//Abstract class has both abstract method and regular methods.
	//And hide the implementations.
	
	
	public void car(){
	System.out.println("My car is Tesla");
	
	}
	
	public abstract void iDoor();
	
	
	public abstract void iWheel();
	
	public abstract void iEngine();
	
	
	public int Boat(){
	
	return 5;
	
	}
	
	
	public String color(){
		
	return "red";	
		
		
	}	
		
	
	
	
	
	public abstract int iSail();
		
	public abstract String iCabin();	
			
			
		
	

}
