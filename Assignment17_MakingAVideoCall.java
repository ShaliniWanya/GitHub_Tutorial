package Homework;
class Parent //Father
{   static void login()
	{
		System.out.println("Parent class login method");
	}
	static void logout()
	{
		System.out.println("Parent class logout method");
	}
	
}

class MakingAposTOnFacebook extends Parent//Child 1
{
	 static void MakingAPost()
	{
		
		System.out.println("Making A Post");
	}
	
	
	
}
class MakingAnAudioCall extends Parent//Child 2
{
	static void MakingAudioCall()
	{
		System.out.println("Making A Audio Call");
	}
		
}

public class Assignment17_MakingAVideoCall  extends Parent // child 3 (single super class is inherited by more than 1 or more sub class)
{
	static  void MakingVideoCall()
	
	{
		
		System.out.println("Making A video call");
		
	}
	
	
	
public static void main(String[] args) {
		// WAP on Hierarchical level inheritence

		login();
		logout();
		MakingAposTOnFacebook.MakingAPost();
		MakingVideoCall();
		MakingAnAudioCall.MakingAudioCall();
		
		
		
		
}
}



