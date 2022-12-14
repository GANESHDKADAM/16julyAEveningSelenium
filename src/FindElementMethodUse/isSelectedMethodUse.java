package FindElementMethodUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethodUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/selenium/practice.html");
         Thread.sleep(1000);
         WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
         System.out.println(checkbox.isSelected());
        checkbox.click();
         System.out.println(checkbox.isSelected());
         if(checkbox.isSelected())
        		 {
        	         System.out.println("this is only checkbox.isselected() test case is fails");
        		 }
         else
         {
        	 System.out.println("this is only checkbox.click() test case is pass");
         }

	}

}
