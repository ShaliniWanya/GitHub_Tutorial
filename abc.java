package Homework;

import java.util.Arrays;

public class abc {

	public static void main(String[] args)
	{
	 
		//reverse a string
		
		String originalstr= "Shalini";
		String reversedstr="";
		
		//char[] result = originalstr.toCharArray();
		
		// converted original string to array and display it
		
		//System.out.println(Arrays.toString(result));[s,h,a,l,i,n,i]
		
		for (int i = originalstr.length()-1 ;i>=0;i--)
		{
			char result = originalstr.charAt(i);
			reversedstr = reversedstr+result ;
			
			//System.out.println(reversedstr);
		 }
		
	System.out.println(reversedstr);
	
	
	/*String  original="Shalini";
	String reversed="";
	
	for (int i=original.length()-1;i>=0;i--)
	
	{
		reversed += original.charAt(i);
		
		
	}
		
	System.out.println("String reversed --> " + reversed);*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
		
		
		
		
		

	}


