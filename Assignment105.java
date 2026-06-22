package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment105 {

	public static void main(String[] args) {
		
		/*WAP using below abstract methods.
               1)isEnabled
               2)isDisplayed
               3)isSelected  */ 
		
		/*ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search_textfield = driver.findElement(By.id("twotabsearchtextbox"));
		search_textfield.sendKeys("shoe");
		
		// when clicking from keyboard
		
		//search_textfield.sendKeys(Keys.ENTER);
		
		//WebElement Search_button=driver.findElement(By.id("nav-search-submit-button"));
		//Search_button.click();
		
		// 1)isEnabled
       // 2)isDisplayed
       // 3)isSelected 
		
		WebElement Searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		
		System.out.println(Searchbutton.isDisplayed());
		
		System.out.println(Searchbutton.isEnabled());
		
		System.out.println(Searchbutton.isSelected());
		
		if (Searchbutton.isDisplayed() && Searchbutton.isEnabled())
		{
			
			Searchbutton.click();
		
		}*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/users/shali/Downloads/grotechminds%20html%20code.html");
		driver.manage().window().maximize();
		
		WebElement check_box = driver.findElement(By.id("123"));
		System.out.println(check_box.isSelected());
		
		if(check_box.isSelected())
		{
			System.out.println("check_box is slected ");
		}
		else 
		{
			check_box.click();
			
		}
		

	}

}
