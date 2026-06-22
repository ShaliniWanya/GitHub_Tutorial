package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment56_1 {

	public static void main(String[] args) {
		// WAP to find whether the string entered by user during run time is Anagram or not

		Scanner sc = new Scanner(System.in);
			String s1 = sc.next();
			String s2 = sc.next();
		
		//String s1 = "shalini";
		//String s2 = "Wanya  ";
			 
			//FIRST REMOVE ALL THE SPACES IN THE STRINGS
			
			s1 = s1.replaceAll(" ", "");
			s2= s2.replaceAll(" ", "");
			
	//NOW CONVERT ALL THE LETTERS OF STRINGS TO UPPERCASE OR LOWERCASE MEANS BOTH STRINGS IN ONE FORMAT
			
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
			
		//NOW CONVERT THE 2 STRINGS INTO CHAR 
		 
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		//SORT THE ARRAYS
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
	if(Arrays.equals(a1, a2))
	{
		System.out.println("Anagram");
	}
	else {
		
		System.out.println("Not an anagram");
	}
		
		
		
		//System.out.println(a1);
		//System.out.println(a2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
