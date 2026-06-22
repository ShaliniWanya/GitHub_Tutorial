package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment106 {

	public static void main(String[] args) {
		
		// WAP to launch below browser and search a medicine.
		// https://www.apollopharmacy.in/search-medicines
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/search-medicines");
		driver.manage().window().maximize();
		
		WebElement search_medicine = driver.findElement(By.id("searchProduct"));
		search_medicine.sendKeys("Paracetamol");
		
		
		
		
		
		
		
		
		

	}

}
