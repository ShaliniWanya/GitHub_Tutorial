package Homework;

import java.util.ArrayList;

public class Assignment71 {

	public static void main(String[] args) {
		// WAP to merge two arraylist using a method with collection parameter.

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(24);
		a1.add(45);
		a1.add(36);
		a1.add(79);
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(42);
		a2.add(54);
		a2.add(63);
		a2.add(97);
		System.out.println(a2);
		
		boolean result = a1.addAll(a2);
		System.out.println(result);
		System.out.println(a1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
