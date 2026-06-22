package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment108 {

	public static void main(String[] args) {
		/* WAP to handle below dropdowns.
		URL - https://grotechminds.com/registration/
			hanlde the dropdown
			1. Skill
			2. Country
			3. Religion
		*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement skill_search = driver.findElement(By.xpath(""));
		skill_search.click();
		
		
		Select sl = new Select(skill_search);
		
		
		
		
		
		
		
		
		

	}

}
