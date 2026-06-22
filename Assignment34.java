package Homework;
//WAP to achieve 50% abstraction
abstract class Animal123{
	
	abstract void sound();
	abstract void eat();
	
}
class Reptile {
	
	void walk()
	{
	System.out.println("Reptile dont have feat");	
		
	}
	void body()
	{
		System.out.println("Reptile dont have legs");
	}
	
}
public class Assignment34 extends Animal123{

	void sound() {
	System.out.println("Animal makes diffrent sound");	
		
	}

void eat() {
	System.out.println("Animal eat differet foods");	
		
	}

public static void main(String[] args) {
	
	/*Reptile r = new Reptile();//this is not an abstract class but a normal class but a different  and it has no abstract methods in it
	//since it is a non static method so we need to create an object to call its methods from different class.
	r.body();
	r.walk();
	Assignment34 obj = new Assignment34();//we need to call abstract methods and call that class where its methods are overridden
	obj.sound();
	obj.eat();
	*/
	//Implicit upcasting --calling only child class methods --child to parent
	/*Animal123 obj = new Assignment34();
	obj.eat();
	obj.sound();
	*/
	//Explicit casting--downcasting ---parent to child ---calling both parent class and child class methods
	Animal123 obj = new Assignment34();//parent to child
	obj.eat();
	obj.sound();
	
	
	
	
	
	
	
}










}
