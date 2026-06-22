package Homework;

import java.time.LocalDate;
import java.util.Scanner;

public class Assignment46 {

	public static void main(String[] args) {
		// WAP  to calculate age of a person if he enters his DOB

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Birth Year");
		int year = 	sc.nextInt();
		
		System.out.println("Enter your Birth Month");
		int Month = 	sc.nextInt();
		
		System.out.println("Enter your Birth Day");
		int day = 	sc.nextInt();
		
		LocalDate dob = LocalDate.of(year,Month,day);
		
		LocalDate today = LocalDate.now();
		
		//calculate age 
		int age = today.getYear()- dob.getYear();
		System.out.println(age);
		
		if(today.getDayOfYear()<dob.getDayOfYear())
		{
			age--;
		}
		
		System.out.println(age);
		
	}

}
