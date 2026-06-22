package Homework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment113 {

	public static void main(String[] args) {
		// WAP to print total number of links present in the given page of the website.
		
		    ChromeDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			
		List<WebElement> linkNo = driver.findElements(By.tagName("a"));
		
		int count = linkNo.size();//size is a method of list collection
		System.out.println("Total no. of links in Google are " + count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
