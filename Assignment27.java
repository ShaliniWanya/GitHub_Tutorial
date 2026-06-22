package Homework;

public class Assignment27 {
	void login(String name) // -- non static methods with params
	{
		System.out.println("This is login1");
		
	}
	void registration(int a ,double b)
	{
		System.out.println("This is registration2 ");
		
		
	}
	void logout(double salary,int age,char n )
	{
		System.out.println("This is logout3");
		
	}
	void signUp(char c,boolean b,long l,String name)
	{
		
		System.out.println("This is signUp4");
	}
	
	public static void main(String[] args) {
		// WAP with combination of 4 non static parameterized methods and try calling all of them

		Assignment27 obj = new Assignment27();
		obj.login("shalini");
		obj.registration(10,30.00);
		obj.logout(90000, 35, 'A');
		obj.signUp('c', false, 1234567890,"Manish");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
