package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass{

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");
		
	}

	@Override
	public void iWheel() {
		System.out.println("My car has 4 Wheel");	
		
	}

	@Override
	public void iEngine() {
		System.out.println("My car has 2 Engine");
		
	}

	@Override
	public int iSail() {
		System.out.println("My car has 1 Sail");
		return 1;
	}

	@Override
	public String iCabin() {
		System.out.println("My car has AC Cabin");
		return "AC";
	}
	
	
	/*(Parent)								(Keyword)				(Child)					(Keyword)   				(GrandChild)
	 * Class[R]								extends					Class
	 * Abstract Class [R] [i]				extends					Class
	 * Interface[i]							implements				Class
	 * Interface[i] 						implements				Interface
	 * 
	 */
	
	

}
