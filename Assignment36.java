package Homework;
//WAP to establish class type casting

class Parent123 // Parent class
{
 void look()
 {
	 System.out.println("Parent look is inherited to their kids ");
 }
 void mind()
 {
	 System.out.println("One of the mond is inherited to child");
 }
	
}
class child extends Parent123 //here student is a child class inheriting parent class properties
{

	void body()
	{
		System.out.println("Body can sometimes be on parent or sometimes unique");
		
	}
	void behaviour()
	{
		
		System.out.println("Its is entirely on the environment of their upbringing");
		}
	}
public class Assignment36
{
	public static void main(String[] args) {
	//class type casting
		//inheriting child class properties 
		
		/*child c = new child();
		c.body();
		c.behaviour();*/
		
		//inheriting parent class properties 	
		
		/*Parent123 p = new Parent123();
		p.look();
		p.mind();*/
		
		// creating child class object and calling parent class methods 
		
		Parent123 p = new child(); // upcasting
		child c = (child) p;
		// p = (Parent123)new child();--wrong
		//child c = (child) new Parent123();
		c.look();
		c.mind();
		c.behaviour();
		c.body();
		
		
		
		
	}
	
	
	
	
	
}



