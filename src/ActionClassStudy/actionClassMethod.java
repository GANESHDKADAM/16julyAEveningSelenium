package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//4 method mouse action:- Duble Click
		// to create the object of action class
		Actions act= new Actions(driver);
	
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//act.moveToElement(doubleclick).perform();
		//act.doubleClick().perform();    // first type to find the double click method
		
		//act.moveToElement(doubleclick).doubleClick().build().perform();    // second type to find the double click method
		
		//act.doubleClick(doubleclick).perform();  // third type to find the double click method
		
		// 5  Mouse action--> Context Click-->(Right Click)
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//act.moveToElement(rightclick).perform();
		//act.contextClick().perform();   // first type to find the right click
		
		//act.moveToElement(rightclick).contextClick().build().perform();    // second type to find the right click
		
		act.contextClick(rightclick).perform();  // third type to find the right click
		
		
		
		
		
		
		
		

	}

}
