package Homework;

import java.util.ArrayList;

public class Assignment81 {

	public static void main(String[] args) {
		// WAP using below methods of ArrayList.
		
		//1.) Clone()
        //2.) equals()
		//3.) LastIndex()

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(45);//--index0
		a1.add(56456);//--index1
		a1.add(null);//--index2
		a1.add(89);//--index3
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(45);//--index0
		a2.add(59);//--index1
		a2.add(null);//--index2
		a2.add(78);//--index3
		
		//EQUALS()
		boolean result = a1.equals(a2);
		System.out.println(result);
		
		//LASTINDEX()
		//System.out.println(a1.lastIndexOf(56456));
		//System.out.println(a1.lastIndexOf(null));
		System.out.println(a1.lastIndexOf(89));
		
		
		//CLONE()
		ArrayList<Integer> a3 = new ArrayList<>();
		System.out.println(a2.clone());
	    System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		
		
		
		
		
		
		
	}

}
