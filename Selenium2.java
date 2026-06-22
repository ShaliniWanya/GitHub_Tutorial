package RevisionDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("quenofdivas2996@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("DeogharCanada@2021");
		
		WebElement login =driver.findElement(By.name("login"));
		login.click();
		
		//once webpage is opened hover over the mouse to FRIENDS icon
		
	WebElement friend = driver.findElement(By.xpath("//span[text()='Friends']/ancestor::a"));
	friend.click();
		
		
		
		
		
		
		
		
		

	}

}
