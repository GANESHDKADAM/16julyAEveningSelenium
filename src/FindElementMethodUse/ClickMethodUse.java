package FindElementMethodUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
	      Thread.sleep(1000);
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	      Thread.sleep(1000);
	      
	      driver.findElement(By.xpath("(//input[@name='radio'])[1]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("(//input[@name='radio'])[2]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("(//input[@name='radio'])[3]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("(//input[@name='radio'])[4]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("(//input[@name='radio'])[1]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("(//input[@name='radio'])[3]")).click();
	      Thread.sleep(1000);

	}

}
