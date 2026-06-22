package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment115 {

	public static void main(String[] args) {
		
		//WAP to drag and drop in below web page."https://grotechminds.com/drag-and-drop/"

		/*ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement gtm_drag_e1 = driver.findElement(By.id("drag2"));
		
		WebElement gtm_drag_e2= driver.findElement(By.id("div2"));
		
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(gtm_drag_e1,gtm_drag_e2).perform();
		*/
		
		/*ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement e1 = driver.findElement(By.id("drag3"));
		
		WebElement e2 = driver.findElement(By.id("div2"));
		
		Actions a2=new Actions(driver);
		a2.dragAndDrop(e1, e2).perform();
		*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		WebElement e1 = driver.findElement(By.xpath("//div[@id='container']"));
		
		WebElement e2 = driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions a2=new Actions(driver);
		a2.dragAndDrop(e1, e2).perform();
		
		
		
		
		
		
		
		
	}

}
