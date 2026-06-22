package Homework;

//WAP on inheritence concept

class Animal
	{
		void sound()
		{
			System.out.println("Diffrent animal makes different sound");
		}
	
		void eat()
		{
			System.out.println("Animals eat different things");
		}
	}
	
	
	class Dog123 extends Animal
	
	{
		void sound1()
		{System.out.println("Dog Barks");
			
		}
		void eat1()
		{
			System.out.println("Dog eats meat");
		}
	}
	
	
	public class Assignment14 {
	
	public static void main(String[] args) {
		

		/*Dog123 d = new  Dog123();//--child class object created but called both
		                         //parent class methods and child class methods because child class extends parent class
		d.eat();
		d.sound();
		d.eat1();
		d.sound1();*/
		
		/*Animal a = new Animal();//-- only parent class methods are called because only parent class object is created,
		// if we create child class object then we can call both child class and parent class methods
		a.eat();
		a.sound();*/
		
		}	
		
	}


