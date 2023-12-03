package com.upskill.java_4;

public class Encapsulation {
	
	
	//Encapsulation is used to hide the data by Setter Method and get the data by Getter Method.
	
	
	private String name = "Upskill";				//write & read
	private int ssn = 1234556;						//write only
	private String username = "raselalam";			//read only
	
	
	//Setter Method - ssn
	public void setSSN(int value){					//set the data, write
		ssn = value;
	}
	
	 
	//Getter Method -username
	public String getUserName(){					//get the data, read
		return username;
		
		
		
		
	}
	
	
	//Setter Method - String name
		public void setName(String value){					//set the data, write
			name  = value;
		}
		
		 
		//Getter Method -String name
		public String getName(){					//get the data, read
			return name;
		}		 
			
		public static void main(String[] args) {
		
			Encapsulation obj = new Encapsulation();
			System.out.println(obj.getName());
			System.out.println(obj.getUserName());
			
			obj.setName("Adnan");
			obj.setSSN(036546623);
			
	}

}
