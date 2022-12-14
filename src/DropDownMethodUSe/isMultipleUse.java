package DropDownMethodUSe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/select-menu");
		    WebElement multiple = driver.findElement(By.id("cars"));
		    
		    Select mul= new Select(multiple);
		    System.out.println("multiple selectable status "+mul.isMultiple());
		    Thread.sleep(1000);
		    
		    mul.selectByVisibleText("Audi");
		    Thread.sleep(1000);
		    
		    mul.selectByValue("saab");
		    Thread.sleep(1000);
		    
		    mul.selectByIndex(0);
		    Thread.sleep(1000);
		    
		   // mul.deselectAll();
		    
		    mul.deselectByVisibleText("Audi");
		    Thread.sleep(1000);
		    
		    mul.deselectByIndex(0);
		    Thread.sleep(1000);
		    
		    mul.deselectByValue("saab");
		    Thread.sleep(1000);
		    driver.close();
		    
		    
		    
	}

}
