package iframepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeuse 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	      Thread.sleep(5000);
	      driver.switchTo().frame("iframeResult");
	      driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
	      Thread.sleep(5000);
	      
	      driver.switchTo().defaultContent();
	      driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	      

	}

}
