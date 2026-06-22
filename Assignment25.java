package Homework;

public class Assignment25 {
	void login() //--non static method with no params
	{
		System.out.println("This is non static method with no params");
	}
	
	void logout(String name) // -- non static methods with params
	{
		System.out.println("This is non static method with params");
		
	}
	void registration(int a ,double b)
	{
		System.out.println("This is again non ststic method with 2 params ");
		
		
	}
	public static void main(String[] args) {
		// WAP to call 3 non static methods in the main method
		Assignment25 obj = new Assignment25();
		obj.login();
		obj.logout("shalini");
		obj.registration(10, 90.00);
		
		
		
		
		
		
		
		
		
	}

}
