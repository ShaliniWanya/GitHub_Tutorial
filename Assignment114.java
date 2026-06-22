package Homework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment114 {

	public static void main(String[] args) throws InterruptedException {
		// WAP to store all the auto suggestions(Texts) of  google search for the word "India" in a ArrayList.
       //https://google.com
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
	    WebElement textarea = 	driver.findElement(By.id("APjFqb"));
	    textarea.sendKeys("India");
		Thread.sleep(3000);
		
	List<WebElement>  list1 = 	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		
		int count = list1.size();
		System.out.println(count);
		 
   ArrayList<String> suggestiontext = new ArrayList<>();
		
	for(int i =0;i<suggestiontext.size();i++)
	{
		WebElement e2 = list1.get(i);
		String text = e2.getText();
	}
		
		
		
		
		
		
	}

}
