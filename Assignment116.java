package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment116 {

	public static void main(String[] args) throws InterruptedException {
		
		// WAP to click on the 5 th auto suggetion of a goole search for the word "SELENIUM"
		// in https://www.google.com/
		
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		WebElement e1 = driver.findElement(By.id("APjFqb"));
		e1.sendKeys("SELENIUM");
		Thread.sleep(3000);
		
		WebElement e2 = driver.findElement(By.xpath("//div[@class='OBMEnb']/ul//li[6]"));
		e2.click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
