package iframepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
	      Thread.sleep(1000);
	      
	      driver.switchTo().frame("courses-iframe");
	      WebElement iframepage = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']"));
	      iframepage.getText();
	     System.out.println(iframepage.getText());
	     
	     driver.switchTo().defaultContent();
	     WebElement mainpage = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
	     mainpage.getText();
	     System.out.println(mainpage.getText()); 
	     
	}

}
