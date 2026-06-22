package Homework;
//WAP to establish relationship between class and interface and the interface to another interface
interface A
{
	abstract void login();
	
	static void registration()//-- abstract class can have only default and static methods
	{
		System.out.println("Registration into Facebook");
		
	}
	
}
interface B extends A //-- interface to interface extends and class to interface extends and  interface to class  nothing not possible 
{
	abstract void  logout();
	
	default void SignUp() //-- abstract class can have only default and static methods
	{
		System.out.println("SignUp when you visit the webpage for the very first time");
		
	}
}
class XYZ implements A,B
{

	@Override
	public void logout() {
		
		System.out.println("Logout while closing");
	}

	@Override
	public void login() {
		
		System.out.println("Lgin with valid credentials");
	}
}
public class Assignment38 {

	public static void main(String[] args) {
		// WAP to establish relationship between class and interface and the interface to another interface

		
		XYZ obj = new XYZ();
		obj.login();
		obj.logout();
		obj.SignUp();
		A.registration();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
