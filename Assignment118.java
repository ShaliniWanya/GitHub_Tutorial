package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment118 {

	public static void main(String[] args) {
		
	// WAP to upload a document in the below  website https://grotechminds.com/registration/
		
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
	    WebElement file_upload = driver.findElement(By.id("file"));
	   // file_upload.sendKeys("C:\\Users\\shali\\Downloads");
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
