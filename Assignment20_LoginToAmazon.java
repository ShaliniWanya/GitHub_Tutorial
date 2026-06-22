package Homework;

public class Assignment20_LoginToAmazon{
	Assignment20_LoginToAmazon()
	{
		this(100);//this calling statement will second constructor proving constructor chaining.
		System.out.println("1");
		
	}
	
	Assignment20_LoginToAmazon(int a )
	{
		this("shalini");// this calling statement will second constructor proving constructor chaining.
		System.out.println("2");
		
	}
	Assignment20_LoginToAmazon(String b  )
	{
		
		System.out.println("3");
		
	}
	
	
public static void main(String[] args) {
		// WAP on this calling statement
		new Assignment20_LoginToAmazon();
		
		
	}

}
