package PopupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpUse 
{

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		/*driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
	    Alert alt=driver.switchTo().alert();
	    Thread.sleep(1000);
	    System.out.println(alt.getText());
	    Thread.sleep(5000);
	    alt.accept();
	    Thread.sleep(5000);*/
	  
	    
	    System.out.println("==============ALERT POPUP HANDLE=================");
	    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	    Thread.sleep(1000);
	    Alert alt1=driver.switchTo().alert();
	    Thread.sleep(1000);
	    System.out.println(alt1.getText());
	    Thread.sleep(5000);
	    alt1.accept();
	    Thread.sleep(5000);
	    
	    
	    
	    
	    

	}

}
