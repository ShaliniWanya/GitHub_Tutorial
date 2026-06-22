package Homework;

public class Assignment42 extends AccessSpecifier {

	public static void main(String[] args) {
		// WAP  to access public protected and default method of one class to another class

		Assignment42 obj = new Assignment42();  //-- To access public protected methods of different class ,
		// we have to create object of that particular class where we are calling the methods,,\
		// and to call the default methods ,as we know default methods are only called in interfaces not the class
		obj.Machine();
		obj.Vehicle();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
