package Homework;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment120 {

	public static void main(String[] args) throws InterruptedException {
		
		// 1)Search for the product "Watch" in flipkart searchbox.
		//2)Click on Watch for women in the auto suggestion.
        //3)Click on the 10th watch listed.
		//4)Navigate to Child window and take screenshot of that watch.
        //5)Store the name of the screenshot using date class - DDMMMYYYYHHHMMSS //Flipkart

		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.flipkart.com");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Watch");
		Thread.sleep(3000);
		
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//ul/li/div"));
		//autosuggestion.click();
		
		Thread.sleep(2000);
		int count = autosuggestion.size();
		System.out.println(count);
		
		autosuggestion.get(count-7).click();
		
	WebElement tenthautosugg = 	driver.findElement(By.xpath("(//div/div[@class='wvIX4U']/div[@class='gqcSqV YGE0gZ']/img)[10]"));
		
	tenthautosugg.click();
		
		Set<String> allwindows = driver.getWindowHandles();//by this we get both parent window and all open child window
		System.out.println(allwindows);
		
		
	Iterator<String> id1 = 	allwindows.iterator();
		
		String parentid = id1.next();
		
		String childid = id1.next();
		Thread.sleep(2000);
		
		driver.switchTo().window(childid);
		
		//TakeScreenshot ts1 = driver;
		
		
		
		
		
		
		
		
		
		
	}

}
