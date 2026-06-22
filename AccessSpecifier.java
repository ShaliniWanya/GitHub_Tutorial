package Homework;
//WAP  to access public protected and default method of one class to another class
public class AccessSpecifier {
	
	public void Vehicle()
	{
		System.out.println("Vehicles have limited longivity");
		
	}
	protected void Machine()
	{
		System.out.println("Machines do have their expiry");
		
	}
	/*default void Food()//--can not create in class,,,default methods are only in interfaces
	{
	
	}
	*/
	public static void main(String[] args) {
		// Assignment 42 continue....
		
		AccessSpecifier obj = new AccessSpecifier();
		obj.Vehicle();
		obj.Machine();
		

	}

}
