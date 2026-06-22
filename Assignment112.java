package Homework;

import java.nio.file.spi.FileSystemProvider;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment112 {

	public static void main(String[] args) {
		
		// WAP to print all the  linktexts present in the given page of the website

		 ChromeDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			
		List<WebElement> linkText = driver.findElements(By.tagName("a"));//here we find count of links means elements
		
		int count = linkText.size();//size is a method of list collection
		System.out.println("Total no. of links in Google are " + count);
		
		
		for (int i=0;i<count;i++)
		{
			WebElement e3 = linkText.get(i);
			String url_text = e3.getDomAttribute("href");
			String linktext = e3.getText();
			System.out.println(linktext);
	
			System.out.println(url_text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
