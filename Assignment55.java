package Homework;

public class Assignment55 {

	public static void main(String[] args) {
		// WAP to find if the given string is a pallindrome

		String input = "KAYAK";
		String output = "";
		
		 for (int i = input.length() - 1; i >= 0; i--)
		{
			output = output + input.charAt(i);
			
		}
		System.out.println(output);
		if(input.equals(output))
		{
			System.out.println("Its a pallindrome");
		}
		else 
		{
			System.out.println("Not a pallindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
