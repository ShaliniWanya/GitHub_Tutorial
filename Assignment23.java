package Homework;

public class Assignment23 {
	// WAP on how to call a non static method (with parameter and without parameter)in main method
	
	void login() //--non static method with no params
	{
		System.out.println("This is non static method with no params");
	}
	
	void logout(String name) // -- non static methods with params
	{
		System.out.println("This is non static method with params");
		
	}
	
public static void main(String[] args) {
		// Call non static method inside main method
		
	Assignment23 obj = new Assignment23();
	obj.login();
	obj.logout("shalini");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
