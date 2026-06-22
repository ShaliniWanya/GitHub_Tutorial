package Homework;
class student 
{
	void registration()
	{
		
		System.out.println("Wanya is registered in the school");
	}
	
}

public class Assignment28 {
	static void Admisssion()
	{
		
		System.out.println("wanya got the admission");
	}

	void Student()
{
	System.out.println("Wanya is a bright student");
}
	public static void main(String[] args) {
		// WAP to access non static method of different class
		
		student s = new student();
		s.registration();
		
		Assignment28 obj = new Assignment28();
		obj.Student();
		

		Admisssion();
		
	}

}
