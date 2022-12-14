package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSizeExample1 
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
		
		Dimension di= new Dimension(400,150);
		Thread.sleep(1000);
		driver.manage().window().setSize(di);
		
		Dimension di1= new Dimension(70,200);
		Thread.sleep(1000);
		driver.manage().window().setSize(di);
	}

}
