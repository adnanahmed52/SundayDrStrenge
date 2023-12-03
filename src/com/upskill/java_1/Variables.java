package com.upskill.java_1;

public class Variables {
	
	//What is Variables in Java?
	
		/*A variable is a container which holds/store the value/data while the 
		  Java program is executed. A variable is assigned with a data type.
		  Variable is a name of memory location. 
		  There are four types of variables in java: Instance or Global Variable, 
		  Local Variable, Static Variable and Method Parameter Variable.
		 */
	
	
	public static void main(String[] args) {
		
			Variables obj = new Variables();
			obj.newyork();
			obj.texas("Steak");
			System.out.println(obj.country);
			System.out.println(president);
			
			
			
	}
	
		
		String country = "USA";                 //Instance OR global variable - Variables declared in Class level, outside of the method.
		static String president = "Biden";      //Static variable - variables belong to class and don't required creating object. 
		
		
		
		
		
		
		public static void newyork() {
			String city = "Bronx";                //Local variable - variables declared in methods.
			String police = "NYPD";
			System.out.println(police);
			
		}
		
		
		public static void texas(String food) {    //Method parameter - passing data outside to inside. variables used as method parameter
			
			
			String city = "Austin";
			String police = "APD";
			System.out.println(police);
			System.out.println(food);
			
			
		}
		
		
		
		
		
		
		
		
		
		
	

}
