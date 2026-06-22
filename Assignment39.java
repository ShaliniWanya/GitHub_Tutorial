package Homework;
//WAP to establish 80% abstraction
abstract class Vehicle123
{
	//Total 80% abstraction
	abstract void Model();//--20% abstraction--no method body
	abstract void Horn();//--20% abstraction--no method body
	abstract void Color();//--20% abstraction--no method body
	abstract void EngineType();//--20% abstraction--no method body
	
	void Feature() // --20% concrete methods that has method body in it
	{
		
		System.out.println("Latest e-bikes have special feature");
	}
	}
class Scooter extends Vehicle123{

	@Override
	void Model() {
	System.out.println("Its scooter activa");	
		
	}

	@Override
	void Horn() {
		System.out.println("Mild soft horn");
		
	}

	@Override
	void Color() {
		
		System.out.println("Scooter is pink in color");
	}

	@Override
	void EngineType() {
		
	System.out.println("CNG");	
	}
	
	
}

public class Assignment39 {

	public static void main(String[] args) {
		// WAP to establish 80% abstraction

		Scooter s = new Scooter();
		s.Color();
		s.EngineType();
		s.Model();
		s.Horn();
		
		
		
		
		
		
		
		
		
		
	}

}
