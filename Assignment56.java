package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment56 {

	public static void main(String[] args) {
		// WAP to find whether the string entered by user during run time is Anagram or not

		Scanner sc = new Scanner(System.in);
	String s1=	sc.next();
	String s2= sc.next();	
		
	//String s1="silent";
		//String s2 ="listen";
		
		//REMOVE STRINGS SPACES
		s1=	s1.replace(" ", "");
	    s2=s2.replace(" ", "");
		
		//CONVERT STRING TO LOWERCASE
	    s1 = s1.toLowerCase();
	    s2= s2.toLowerCase();
	
	//CONVERT STRING TO CHAR ARRAY
	    char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
     
    	
	}
}
