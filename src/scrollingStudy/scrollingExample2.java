package scrollingStudy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingExample2 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		Dimension webpagesize = driver.manage().window().getSize();
		System.out.println(webpagesize);
		
		//create Dimension class object and pass the width and height value
		Dimension di= new Dimension(850,500);
		// using dimension class object to access the setsize method
		Thread.sleep(1000);
		driver.manage().window().setSize(di);
		
		
		//create the javascrolling interface
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(1000);
		

	}

}
