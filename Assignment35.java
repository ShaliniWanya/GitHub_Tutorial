package Homework;
//WAP for multiple inheritence

class Mother 
{
	void care()
	{
		System.out.println("Mother care is uncomparable");
	}
	void love()
	{
		System.out.println("Mother love is unconditional");
	}
}
class childA extends Mother
{
	
	void affection()
	{
		System.out.println("ChildA is more affectionate to Mother");
	}
	void behaviour()
	{
		
		System.out.println("ChildA is usually arrogant");
	}
}	
class ChildB extends childA
{
	void studious()
	{
		
		System.out.println("ChildB is studious");
	}
	void self()
	{
		
		System.out.println("ChildB is emotional");
	}
	
	
}
	
public class Assignment35 {

	public static void main(String[] args) {
		// WAP for multiple inheritence

		ChildB obj = new ChildB();
		obj.affection();
		obj.behaviour();
		obj.care();
		obj.love();
		obj.self();
		obj.studious();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
