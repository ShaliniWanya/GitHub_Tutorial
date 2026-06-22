package Homework;

import java.util.Vector;

public class Assignment89 {

	public static void main(String[] args) {
		// WAP to store data elements in a vector and utilize all it's methods

		         Vector v1 =new Vector();
		         v1.add(23);
		         v1.add(89);
		         v1.add(55);
		         
		         Vector v2 =new Vector();
		         v2.add(22);
		         v2.add(88);
		         v2.add(55);
		
	            // v1.addAll(v2);
		        // System.out.println(v1);
		
		       //  v1.add(1, 99);
		       //  System.out.println(v1);
		
                // v1.remove(0);
		         // System.out.println(v1);
		
		           //v1.clear();
		           //System.out.println(v1);
		
		Vector<Integer> v3 =(Vector<Integer>) v1.clone(); 
		System.out.println(v3);
		
		
		
	}

}
