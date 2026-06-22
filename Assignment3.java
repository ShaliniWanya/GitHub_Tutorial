package Homework;

public class Assignment3 {
       
	//  Call Static method inside the main method
	
	static void add()
		{
		int a=20;
		int b=40;
		int c= a+b;
		System.out.print("Result of Addition is : ");
		System.out.println(c);
		}
		
		static void sub()
		{
		int a1=20;
		int a2=40;
		int c1=a1-a2;
		System.out.print("Result of Substraction is : ");
		System.out.println(c1);
		}
		
		static void mul()
	    {
	    int a3=20;
		int a4=40;
		int c4=a3*a4;
		System.out.print("Result of Multiplication is : ");
		System.out.println(c4);
	    
	    }
	    static void div()
	    {
		int a5=20;
		int a6=40;
		int c9=a6/a5;
		System.out.print("Result of Division is : ");
		System.out.println(c9);
	    }
	    
		static void mod()
		{ 
		int d=15;
		int e=40;
		int f=e%d;
		System.out.print("Result of Modulus is :  ");
		System.out.println(f);
		
		}
		public static void main(String[] args) {
			
		
				add();
				sub();
				mul();
				div();
				mod();
				
				

		}

	}


