package FindElementMethodUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDesplacedMethodUse
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
         Thread.sleep(1000);
         WebElement textbox = driver.findElement(By.id("displayed-text"));
           textbox.sendKeys("Hi Ganesh How R U");
           Thread.sleep(1000);
          // textbox.clear();
        WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
        hidebutton.click();
        Thread.sleep(1000);
        WebElement showbutton = driver.findElement(By.id("show-textbox"));
           
         showbutton.click();
       /*   if(textbox.isDisplayed())
           {
        	   textbox.sendKeys("Hi Gopika How R U");
        	   System.out.println("test case is pass");
        	   
           }
           else
           {
        	   System.out.println("test case is fail");
           }*/
	}

}
