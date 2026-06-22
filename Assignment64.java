package Homework;

public class Assignment64 {

	public static void main(String[] args) {
		
		// WAP using different methods of StrigBuffer class
		// First Create an object of StringBuffer Class
		
		//**APPEND
		StringBuffer s= new StringBuffer("Shalini");
		s.append(" Jha");
		System.out.println(s);
		
		//**REPLACE
		StringBuffer s1= new StringBuffer("Shalini");
		s1.replace(0, 1 , "i");
		System.out.println(s1);
		
		//INSERT
		StringBuffer s2= new StringBuffer("Shalini");
		s2.insert(7, " Jha");
		System.out.println(s2);
		
		//DELETE
		StringBuffer s3= new StringBuffer("Shalini");
		s3.delete(0, 3);
		System.out.println(s3);
		
		//REPLACE
		StringBuffer s4= new StringBuffer("Shalini");
		s4.replace(0, 3, "Ma");
		System.out.println(s4);
		
		//LENGTH
		StringBuffer s5= new StringBuffer("Shalini");
		int output = 	s5.length();
	    System.out.println(output);
		
		//REVERSE                                                  
	    StringBuffer s6= new StringBuffer("Shalini");
	    s6.reverse();
		System.out.println(s6);
		
		//CharAt
		StringBuffer s7= new StringBuffer("Shalini");
		char output1 = s7.charAt(6);
	    System.out.println(output1);
		
	    //CAPACITY
	    StringBuffer s8= new StringBuffer("Shalini");
		int output2 = s8.capacity();
		System.out.println(output2);
		
		StringBuffer s9= new StringBuffer("Jha");
		int output3 = s9.capacity();
		System.out.println(output3);
		
		
		
		
		
		
		
		
		
		
		
	}

}
