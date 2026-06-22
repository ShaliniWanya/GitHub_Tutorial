package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment111 {

	public static void main(String[] args) {
		
// WAP to write the text on one field, double click on it to select it, copy it and paste it into another field     

		    ChromeDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://grotechminds.com/registration/");
			WebElement e1 = driver.findElement(By.xpath("//input[@id='fname']"));
			e1.sendKeys("WanyaShree");
			
			//e1.sendKeys(Keys.CONTROL+"a");
			
			Actions a1 = new Actions(driver);
			a1.doubleClick(e1).perform();
		
			e1.sendKeys(Keys.CONTROL+"c");
			
            WebElement e2 = driver.findElement(By.xpath("//input[@id='lname']"));
		    e2.sendKeys(Keys.CONTROL+"v");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
