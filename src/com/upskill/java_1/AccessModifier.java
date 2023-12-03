package com.upskill.java_1;

public class AccessModifier {

	/*Access modifiers are object-oriented programming that is used to set the accessibility of classes,
	constructors, methods, and other members of Java. Using the access modifiers we can set the scope 
	or accessibility of these classes, methods, constructors, and other members.
	*/
	
	
	public static void main(String[] args) {
		
		
		String name = "Adnan"    ;                   //public - Any class can access
		int age = 25;                               //private -only same class can access 
		int ssn = 4587626;                         //protected - classes in the same package and subclass can access                
		String address = "Heritage Tower"  ;      // default - classes in same package can access
	
	}

}
