package Homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment47 {

	public static void main(String[] args) {
		// WAP to print Date in MMDDYYYY format exactly after 1 month from current date

		Date d = new Date();//--EPOCH time
		System.out.println(d.getTime());
		
		/*Date d1 = new Date(d.getTime());//Human understandable time
		System.out.println(d1);
		*/
		
		Date d1 = new Date(d.getTime()+ (1000L*60*60*24*30));//Human understandable time
		System.out.println(d1);
		
		String format1 = d1.toString();//converts date class to string
		System.out.println(format1);
		
		String month = format1.substring(4, 7);
		System.out.println(month);
		
		String day = format1.substring(8,10 );
		System.out.println(day);
		
		String year = format1.substring(24 );
		System.out.println(year);
		
		String format2 = month + " ".concat(day)+" ".concat(year);
		System.out.println(format2);
		
		SimpleDateFormat f= new SimpleDateFormat("MMDDYYYY");
		f.format(d);
		
	}

}
