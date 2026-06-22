package Homework;

public class Assignment26 {
	void login() //--non static method with no params
	{
		System.out.println("This is non static method with no params");
	}
	void login(String name) // -- non static methods with params
	{
		System.out.println("This is non static method with params");
		
	}
	static void logout()
	{
		System.out.println("This is ststic method with no params and it can be called directly in PSVM");
		
	}
	
public static void main(String[] args) {
		// WAP with combination of static and non static methods and try calling both of them
 
	Assignment26 obj = new Assignment26();
	obj.login();
	obj.login("Wanya");
	logout();	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
