package FindElementMethodUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethodUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
         Thread.sleep(1000);
         driver.manage().window().maximize();
         //1 1st way
         driver.findElement(By.xpath("(//b[contains(text(),'EPFO NEVER ')])[1]")).getText();
         System.out.println(driver.findElement(By.xpath("(//b[contains(text(),'EPFO NEVER ')])[1]")).getText());
         //2 2nd way
         WebElement mytext = driver.findElement(By.xpath("(//b[contains(text(),'EPFO NEVER ')])[1]"));
      System.out.println(mytext.getText());
      //3 3rd way
      String mystring = driver.findElement(By.xpath("(//b[contains(text(),'EPFO NEVER ')])[1]")).getText();
      System.out.println("my pf portal text is "+mystring);
         
      driver.get("https://vctcpune.com/selenium/practice.html");
      Thread.sleep(1000);
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//legend[text()='Auto Suggestive Dropdown Example']")).getText();
      System.out.println(driver.findElement(By.xpath("//legend[text()='Auto Suggestive Dropdown Example']")).getText());
      
      
	}
	
	

}
