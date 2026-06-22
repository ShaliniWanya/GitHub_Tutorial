package Homework;

//WAP on single level inheritence

class Vehicle
{
	String brand = "Hyundai";
	
	void start()
	{
		System.out.println("Vehicle is starting");
	}
	
	}

class car extends Vehicle
{
	String model = "i20";
	
	void display()
	{
		System.out.println("model : " + model);
		
	}
	
}

public class Assignment15 {

	public static void main(String[] args) {
		
		car c =new car();
	//variables - no variables of parent class can be inherited,only methods can be inherited in chid class from parent class
		//c.brand;
		//c.model
		
	// methods
		c.start();
		c.display();
		
		
		
		
		
		
		

	}

}
