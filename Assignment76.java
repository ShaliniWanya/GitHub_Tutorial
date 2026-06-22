package Homework;

import java.util.ArrayList;

public class Assignment76 {

	public static void main(String[] args) {
		// WAP of array list using below methods
		// contains()
		//containsAll()

		ArrayList<String> name = new ArrayList<String>();
		name.add("Shalini");
		name.add("Wanya");
		name.add("Kajal");
		
		System.out.println(name);
	    boolean result = name.contains("Kajal");
		System.out.println(result);
		
		boolean result2 = name.contains("");
		System.out.println(result2);
		
		boolean result3 = name.containsAll(name);
		System.out.println(result3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
