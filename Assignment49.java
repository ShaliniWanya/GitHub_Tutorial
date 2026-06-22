package Homework;

import java.util.Scanner;

public class Assignment49 {

	public static void main(String[] args) {
		// WAP on switch case with switch parameter as user input String

		System.out.println("Enter weekday name ");
		Scanner sc = new Scanner(System.in);
		int weekday = sc.nextInt();
		
		switch(weekday)
		{
		case 1:
		
			System.out.println("Monday");
			break;
		
		case 2:
		{
			System.out.println("Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Thursday");
			break;
		}
		case 5:
		{
			System.out.println("Friday");
			break;
		}
		case 6:
		{
			System.out.println("Saturday");
			break;
		}
		case 7:
		{
			System.out.println("Sunday");
			break;
		}
		default:
		
			System.out.println(" ERROR: NO such day ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void Switch(String weekday) {
		// TODO Auto-generated method stub
		
	}

}
