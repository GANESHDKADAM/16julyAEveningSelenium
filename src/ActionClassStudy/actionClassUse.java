package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		
	     // 1. method:- moveToElement
		
		// 1  first we create the object of action class
		
		Actions act= new Actions(driver);
		
		// 2 to find the one of the action class method an perform the action
		Thread.sleep(1000);
		
		WebElement movetoele = driver.findElement(By.xpath("//a[text()=' LOAN ']"));
		Thread.sleep(1000);
		
		
		
		act.moveToElement(movetoele).perform();
		Thread.sleep(1000);
		
		// 2. method:- mouse action:- click()
		
		// to find the oe of the action class method to perform the action of webelement
		Thread.sleep(1000);
		WebElement clickme = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		Thread.sleep(1000);
		//act.moveToElement(clickme).perform();  // first type to find click
		//Thread.sleep(1000);
		//act.click().perform();
		//Thread.sleep(1000);
		
		//act.click(clickme).perform();    // second type to find click
		
		//act.moveToElement(clickme).click().build().perform();  // third type to find click
		
		// 3 method:- mouse action drag and drop
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destination = driver.findElement(By.id("amt8"));
		
		//act.moveToElement(source).clickAndHold().release(destination).build().perform();  // first type to drag and drop find
		Thread.sleep(1000);
		act.dragAndDrop(source, destination).perform();  // second type to drag and drop find
		
		

	}

}
