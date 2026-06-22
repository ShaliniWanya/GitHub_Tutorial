package Homework;

interface student1
//WAP using implements keyword}
{
    void name();
	void ID();
	}
class teacher123 implements student1
{
	public void name() {
		System.out.println("Student name : Shalini");
		
	}
    public void ID() {
		System.out.println("Student Id : 101");
		
	}
}
public class Assignment33{
	
	public static void main(String[] args) {
		
		student1 s = new teacher123();
		s.name();
		s.ID();
		}}



