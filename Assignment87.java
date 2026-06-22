package Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment87 {

	public static void main(String[] args) {
		// WAP to store String objects in a set and iterate the elements of SET

		Set<String> s1= new HashSet<>();
		s1.add("Shalini");
		s1.add("Jha");
		s1.add("Wanya");
		s1.add("Shree");
		Iterator output = s1.iterator();
		while(output.hasNext())
		{
			System.out.println(output.next());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
