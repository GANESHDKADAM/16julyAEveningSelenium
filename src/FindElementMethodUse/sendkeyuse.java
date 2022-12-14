package FindElementMethodUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeyuse 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ganesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Aarav");
		Thread.sleep(1000);
		WebElement mysendkey = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		Thread.sleep(1000);
              mysendkey.sendKeys("Gopika");
              Thread.sleep(1000);
              mysendkey.clear();
              Thread.sleep(1000);
              mysendkey.sendKeys("Ashwini");
              Thread.sleep(1000);
              
              
              driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
              Thread.sleep(1000);
              driver.manage().window().maximize();
              WebElement pfmemberhome = driver.findElement(By.xpath("//input[@id='userName']"));
              
              pfmemberhome.sendKeys("my pf no");
              Thread.sleep(1000);
              pfmemberhome.clear();
              Thread.sleep(1000);
              pfmemberhome.sendKeys("my new pf no");
              driver.close();
             
              }

}
