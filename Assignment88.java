package Homework;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment88 {

	public static void main(String[] args) {
		// WAP to store elements in a vector and to iterate the elements using 
		
		//Enumeration
		//ListIterator
		//Iterator
         
		Vector v1 =new Vector();
         v1.add(23);
         v1.add(89);
         v1.add(55);
         v1.add(66);
         v1.add(22);
        
         //ITERATOR
      /*  Iterator<Integer> i1 =  v1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}*/
		//LISTITERATOR
		/*ListIterator<Integer>  l2 = v1.listIterator(v1.size());
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}*/
		//ENUMERATION
         Enumeration<Integer> e1=v1.elements();
         while(e1.hasMoreElements())
         {
        	 System.out.println(e1.nextElement());
         }
        
		
		
		
		
		
		
		
		
		
		
		
	}

}
