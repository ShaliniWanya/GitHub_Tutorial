package Homework;

import java.util.Scanner;

public class Assignment45 {

	public static void main(String[] args) {
		// WAP to reverse a string
		// WAP to reverse the user input string 
		
		// WAP to reverse a string
		
		String input = "Shalini";
		String output = "";
		
		for(int i = input.length()-1;i>=0;i--)
		{
			char c = input.charAt(i);
			output = output + c;
		}
		System.out.println(output);
		
		
		// WAP to reverse the user input string 
		
		Scanner sc = new Scanner(System.in);
		//sc.next();
		System.out.println("Enter any name");
        String input2 = sc.next();
		String output2 = "";
		
		for(int i = input2.length()-1;i>=0;i--)
		{
			char c = input2.charAt(i);
			output2 = output2 + c;
		}
		System.out.println(output2);
		
		sc.close();
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
