package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumfirstcode 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.blrlogistiks.com/"); // 1. get method is use to open the one url in our browser that time we can use
		
		driver.manage().window().maximize();  // 2. maximize method is use to maximize the our open url by defual is open in minimize but this method is to maximize
		Thread.sleep(1000);                   // thread.sleep is used to pause the our method and url is sometime that why we use
		driver.manage().window().minimize();  // 3. minimize is used to minimize the our url then we can use
		Thread.sleep(1000);
		driver.close();     //4. this method is used to close the our current windows
		//driver.quit();	//5. this method is used to close the our all windows open is selenium windows	

	}

}

