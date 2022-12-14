package NeostoxBase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass 
{
	 protected WebDriver driver;
		public void launchBrowser() throws InterruptedException
		{
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("https://neostox.com/");
			driver.manage().window().maximize();
			Reporter.log("luanching the browser",true);
		    Thread.sleep(1000);
		}

}
