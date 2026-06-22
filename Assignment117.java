package Homework;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment117 {

	public static void main(String[] args) throws IOException {
		
		// WAP to get title of the child window in any application.
		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		 WebElement todaysDeals = driver.findElement(By.linkText("Today's Deals"));
	     todaysDeals.click();
		
		//get parent windowhandle 
	     
	     String parentwindowhandle = driver.getWindowHandle();
	     System.out.println(parentwindowhandle);
	     
	     //get all windowhandles
	     
		Set<String> allwindowhandles = driver.getWindowHandles();
		
		//switch to child window
		
		for (String window : allwindowhandles)
		{
			if(!window.equals(parentwindowhandle))
			{
				driver.switchTo().window(window);
			}
			System.out.println("Chid window Title:" + driver.getTitle());
		
			TakesScreenshot ts1 = driver;
			File sourcefile = ts1.getScreenshotAs(OutputType.FILE);	
			
			File destinationfile2  = new File("C:\\Workspaces\\1st Workspace (June 12,2024)\\MKT Assignments\\screenshot\\Shalini.png");
			
			FileHandler.copy(sourcefile, destinationfile2);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
