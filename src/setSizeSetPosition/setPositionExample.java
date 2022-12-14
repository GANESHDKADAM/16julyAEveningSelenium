package setSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.commonlyMethodUse;

public class setPositionExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		commonlyMethodUse.implicitwait(driver, 100);
		
		// to get this size of our webpage position by using getposition method
		
		Point webpagebydefualtpositionsize = driver.manage().window().getPosition();
		System.out.println(webpagebydefualtpositionsize);
		
		// create object of point class with mentioned width and height of our webpage position
		Point po= new Point(100,10);
		//usint point class object to acive set position of our webpage
		commonlyMethodUse.implicitwait(driver, 100);
		driver.manage().window().setPosition(po);
		
		Point po1= new Point(300,10);
		commonlyMethodUse.implicitwait(driver, 100);
		driver.manage().window().setPosition(po1);
		
		Point po2= new Point(500,10);
		commonlyMethodUse.implicitwait(driver, 100);
		driver.manage().window().setPosition(po2);
		
		Point po3= new Point(300,10);
		Thread.sleep(1000);
		driver.manage().window().setPosition(po3);
		
		Point po4= new Point(5,500);
		Thread.sleep(1000);
		driver.manage().window().setPosition(po4);
		
		Point po5= new Point(4,4);
		Thread.sleep(1000);
		driver.manage().window().setPosition(po5);


	}

}
