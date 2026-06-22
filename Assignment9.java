package Homework;

public class Assignment9 {

	public static void main(String[] args) {
		
		// WAP on logical operators with AND...OR...AND NOT...OR NOT 
		
		// AND 
		
		int x = 25;
		int y = 10;
		
		if (x> 15 && y < 15) // Both condition should be TRUE
			{ System.out.println(x +y);
			} 
		else 
		{ System.out.println("Number is out of range");
		}
		
		//OR
		
		int x1 = 25;
		int y1 = 10;
		
		if (x1 > 15 || y1 > 15) // Only condition should be TRUE
			{ System.out.println("Either one is correct");
			} 
		else 
		{ System.out.println("None is correct");
		}
		
		//NOT 
		
		 int a = 10, b = 20;
		 
		 if (!(a > 0 && b > 0)) {
	            // condition returned true but
	            // logical NOT operator changed
	            // it to false
	            System.out.println("Both values are greater than 0");
	        } else {
	            System.out.println("Both values are less than 0");


	}

	}
}
