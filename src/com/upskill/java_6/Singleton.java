package com.upskill.java_6;

public class Singleton {
	//Single is class that can have only one object.
	
	
	//Private Constructor, it prevents any other class from instantiating.
	private Singleton(){
		
		
	}
	
	//Private static object of the class.
	private static Singleton Singletonobj = new Singleton(); 
	
	
	public static Singleton getInstance(){
		return Singletonobj;
	
	}
		
		protected static void demo(){
			
			System.out.println("Demo method for singleton class");
			
		}
		
		
	
	
	
}
