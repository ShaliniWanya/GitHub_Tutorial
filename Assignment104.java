package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment104 {

	public static void main(String[] args) {
		
		// WAP to login to Facebook using id locator.
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement login_username = driver.findElement(By.id("email"));
		login_username.sendKeys("quenofdivas2996@gmail.com");
		
		WebElement login_password = driver.findElement(By.id("pass"));
		login_password.sendKeys("sdsfjhisdc");
		
		WebElement login = driver.findElement(By.id("u_0_5_H1"));
		login.click();
		
		//driver.navigate().refresh();//not refreshing captcha
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
