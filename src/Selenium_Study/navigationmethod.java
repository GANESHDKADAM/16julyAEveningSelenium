package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationmethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.navigate().forward();
		   Thread.sleep(1000);
		   driver.navigate().back();
		   Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.quit();
		//driver.get("https://www.blrlogistiks.com/");
		
		// we can use navigation method in that method 1). forward 2).Backward 3).Release
		
	  

	}

}
