package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment84 {

	public static void main(String[] args) {
		// WAP to store the elements in a List and iterate them in foreward and backward way

		List<Integer> l1 = new ArrayList<>();
		l1.add(67);
		l1.add(99);
		l1.add(92);
		l1.add(100);
		ListIterator output =  l1.listIterator();
		while(output.hasNext())
		{
			System.out.println(output.next());
		}
		while(output.hasPrevious())
		{
			System.out.println(output.previous());
		}
		
		
		
		
		
		
	}

}
