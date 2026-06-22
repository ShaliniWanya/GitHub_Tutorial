package Homework;

public class Assignment67 {

	public static void main(String[] args) {
		//WAP to logically accomodate 2 or more exception in a single program.
        try {
        	String name=null;
		    System.out.println(name.length());//----NullPointerException
		    
		    int a =10/0;//----Arithmetic Exception
		    
		   int array1[] =new int[3];
		   System.out.println(array1[5]);//---ArrayIndexOutofBoundException
		    
		    }
		catch (NullPointerException e)
		{
			System.out.println("Handled NullPointerException");
		}
        catch (ArithmeticException e)
		{
			System.out.println("Handled ArithmeticException");
		}
        catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled ArrayIndexOutofBoundException");
		}
		
		
		
		
		
		
		
		
		
		
	
	}
}
