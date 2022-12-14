package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSizeExample 
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
		
		//to set the size we create the object of dimention class and pass the width and hight value
		
		Dimension d= new Dimension(850,1400);
		// to set the size of dimention class by using setsize method
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		
		//to set the size we create the object of dimention class and pass the width and hight value
		Dimension d1= new Dimension(1000,300);
		Thread.sleep(2000);
		driver.manage().window().setSize(d1);
		
		
		
		
		
		
	

	}

}
