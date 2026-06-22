package Homework;

public class Assignment68 {

	public static void main(String[] args) {
		// WAP on exception handling using one try block and multiple catch blocks.

		try {
		int a=10/0; // Arithematic Excetion
		
		String s = "null";
		System.out.println(s.length());//NullPointer Exception
		
		int array1[]=new int[3];
		System.out.println(array1[5]);//ArrayIndexOutofBound Exception
		
		}
		catch(ArithmeticException e)
		{System.out.println("Handled Arithmetic Exception");
		}	
		catch(NullPointerException e)
		{
			System.out.println("Handled NullPointer Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled ArrayIndexOutofBoundException ");
		}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}


