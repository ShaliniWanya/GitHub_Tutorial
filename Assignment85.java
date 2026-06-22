package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment85 {

	public static void main(String[] args) {
		// WAP to store the elements in a list and use .Iterate method to iterate the elements in forwards direction.

		List<Integer> l1 = new ArrayList<>();
		l1.add(600);
		l1.add(700);
		l1.add(800);
		l1.add(900);
		ListIterator output =  l1.listIterator();
		while(output.hasNext())
		{
			System.out.println(output.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
