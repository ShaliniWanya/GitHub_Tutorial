package Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment86 {

	public static void main(String[] args) {
		// WAP to store data elements in a set and to iterate the elements of set.
		
		// no insertion order
		//no indexing
		// store homo + hetero data
		// accepts many null values but prints only once
		// accepts duplicates but do not print
		
		/*HashSet myset = new HashSet();
		//add elements
		myset.add("Shalini");
		myset.add("Srinath");
		myset.add(15);
		/*myset.add(true);
		myset.add('a');
		myset.add(10.5);
		myset.add(60f);
		myset.add(null);
		myset.add(null);
		myset.add(null);
		myset.add(null);
		myset.add(null);
		myset.add("Shalini");
		myset.add("Shalini");*/
		//System.out.println(myset);
		//System.out.println(myset.size());// tells us the size of a set that how many elements we added 
		//myset.clear();// clears the entire set collection
		//myset.remove("Srinath");
		// to read data from set
		//for each loop
		/*for (Object sha:myset)
		{
			System.out.println(sha);
		}*/
		
		//iterator
		/*System.out.println("Reading data through iterator");
		Iterator itr = myset.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		// access specific element from set
		// directly not possible 
		//ArrayList mylist = new ArrayList(myset);
		// List mylist= new ArrayList();
		//System.out.println(mylist);
		//System.out.println(mylist.get(3));
		//back to set 
		//Set myset1=new HashSet(mylist);
		//System.out.println(myset1);
		
		// WAP to store data elements in a set and to iterate the elements of set.
		
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
