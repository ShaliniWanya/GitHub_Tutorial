package Homework;

public class Assignment32 {

	String name;
	int ID;
	double salary;
	
	
  void Employee(String name, int ID,double salary)
	{
		this.name=name;
		this.ID=ID;
		this.salary=salary;
		
	}
	
 public static void main(String[] args) {
		// WAP on this keyword

		Assignment32 obj = new Assignment32();
		obj.Employee("Shalini", 101, 100000);
		System.out.println(obj.name);
		System.out.println(obj.ID);
		System.out.println(obj.salary);
		
		
		
		
		
		
		
		
		
	}

}
