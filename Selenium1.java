package RevisionDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium1 {
	
	
	public static void main(String[] args) {
		
         WebDriver driver = new ChromeDriver();
         // driver.get("https://www.amazon.com/");
          driver.navigate().to("https://www.amazon.ca/");
          driver.manage().window().maximize();
	      driver.navigate().refresh();
	     
	
	    WebElement signin = driver.findElement(By.className("nav-line-1-container"));
	    Actions action= new Actions(driver);
	    action.moveToElement(signin).perform();
	    driver.findElement(By.xpath("//a/span[text()='Sign in']")).click();
	    
	  WebElement email =   driver.findElement(By.id("ap_email_login"));
	    email.sendKeys("r.anand27@yahoo.com");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  
	}
        

}
