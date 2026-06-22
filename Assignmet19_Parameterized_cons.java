package Homework;
class University123
{
	University123()
	{
		
		System.out.println("It is a  university");
		
	}
	
}
class college123 extends University123
{
	college123()
	{
		
		super();
		System.out.println("Default constructor");
		
	}
	
	college123(String a)
	{
		super();
		System.out.println("It is a college");
		
	}	
	}
public class Assignmet19_Parameterized_cons extends college123 {

	Assignmet19_Parameterized_cons()
	{
		super("shalini");
		System.out.println("Is is a child class constructor");
		
	}

	public static void main(String[] args) {
		//  WAP on super calling statement using  parameterized super calling statement

		 //University u = new University();
		//college c = new college();
			
		new Assignmet19_Parameterized_cons();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

