package Homework;

//WAP on multi level inheritence

class LaunchAndQuit
{
	static void LaunchBrowser()
	{
		System.out.println("Browser is launched");
	}
	static void QuitBrowser()
	{
		System.out.println("Browser is closed");
		
	}
}
class login extends LaunchAndQuit
{
	
	static void loginWithValidCredentials()
	{
		LaunchBrowser();
		QuitBrowser();
	}
	
}

public class Assignment16 extends login {

	public static void main(String[] args) {
		
		//LaunchBrowser();
		//QuitBrowser();
		loginWithValidCredentials();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
