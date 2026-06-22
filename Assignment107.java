package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment107 {

	public static void main(String[] args) {
		// WAP using below locators.

           //1)Linktext
           //2)PartialLinktext
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	   // WebElement link_text = driver.findElement(By.linkText("Gmail"));
	   // link_text.click();
		
	    //partialLinktext
	    
	    WebElement par_link_txt=driver.findElement(By.partialLinkText("Ima"));
	    par_link_txt.click();
	   
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
