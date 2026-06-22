package Homework;
               //WAP on method overiding
class Animal1
{
	void sound()
	{
		 // this();-- this is only used in constructors
		System.out.println("Animal has different sound");
	}
}
class Dog extends Animal1
{    
    void sound()
    
{      // this();-- this is only used in constructors
    	System.out.println("Dog barks");

}
}	
public class Assignment21 {
	
	 
public static void main(String[] args) {
		//Animal a =new Animal();
		//a.sound();
	
	   Dog d =new Dog();
		d.sound();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
