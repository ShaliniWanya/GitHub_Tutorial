package Homework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment119 {

	public static void main(String[] args) throws IOException {
		
		// WAP to take screenshot of a webPage and store the screenshot name using Math.random().

		
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		TakesScreenshot ts1 = driver;
		File sourcefile = ts1.getScreenshotAs(OutputType.FILE);
		
		//File destinationfile  = new File("C:\\Workspaces\\1st Workspace (June 12,2024)\\MKT Assignments\\screenshot\\Shalini."+ Math.random() +".png");
		
		//File destinationfile3  = new File("C:\\Workspaces\\1st Workspace (June 12,2024)\\MKT Assignments\\screenshot\\"+new Assignment119().getClass()+ Math.random() +".png");
		
	  File destinationfile2  = new File("C:\\Workspaces\\1st Workspace (June 12,2024)\\MKT Assignments\\screenshot\\Shalini.png");
		
		FileHandler.copy(sourcefile, destinationfile2);
		
		
		
		
		
	}

}
