package setSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPositionExample1 
{

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		Point webpageposition = driver.manage().window().getPosition();
		System.out.println(webpageposition);
		
		Point p= new Point(700,10);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		
		Point p1= new Point(900,10);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p1);
		
		Point p2= new Point(3,3);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p2);
		driver.close();

	}

}
