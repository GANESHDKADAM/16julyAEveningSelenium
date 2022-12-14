package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urltitlemethoduse 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.vctcpune.com/");
		Thread.sleep(1000);
		driver.getTitle();
		System.out.println(driver.getTitle());
		String mytitle = driver.getTitle();
		System.out.println("this is my title is "+mytitle);
		
		String expectedtitle="Velocity | Best software testing centre in Pune and Mumbai";
		String actualtitle="Velocity | Best software testing centre in Pune and Mumbai";
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("this is correct title test case is pass");
			
		}
		else
		{
			System.out.println("this is not correct title test case is fail");
		}
	}

}
