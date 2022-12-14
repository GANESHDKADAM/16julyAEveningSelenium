package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currenturlmethoduse 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.vctcpune.com/");
		Thread.sleep(1000);
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String mycurrernturl = driver.getCurrentUrl();
		System.out.println("this is my current url is "+mycurrernturl);
		
		String currenturl="https://vctcpune.com/";
		String expectedurl="https://vctcpune.com/";
		if(currenturl.equals(expectedurl))
		{
			System.out.println("this is my current url and test case is pass");
		}
		else
		{
			System.out.println("this is not current url and test case is fail");
		}
		driver.close();		

	}

}
