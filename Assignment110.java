package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment110 {

	public static void main(String[] args) {
		
		// WAP to Copy the text from one field and paste it into another field
		
		    ChromeDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://grotechminds.com/registration/");
			WebElement e1 = driver.findElement(By.xpath("//input[@id='fname']"));
			e1.sendKeys("Wanya Shree");
			
			e1.sendKeys(Keys.CONTROL+"a");
			
			e1.sendKeys(Keys.CONTROL+"c");
		
			WebElement e2 = driver.findElement(By.xpath("//input[@id='lname']"));
		
			e2.sendKeys(Keys.CONTROL+"v");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
