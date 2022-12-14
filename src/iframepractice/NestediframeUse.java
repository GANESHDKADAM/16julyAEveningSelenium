package iframepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediframeUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
	      Thread.sleep(1000);
	      WebElement mainpage = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
	      mainpage.getText();
	      
	      
	      System.out.println(mainpage.getText());
	      
	      driver.switchTo().frame("frame1");// main page to iframe page parent frame
	      
	      String parentframetext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	      System.out.println(parentframetext);
	      
	    //switching focus from parent frame to child frame
	      
	     driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
	     String childframetext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	     System.out.println(childframetext);
	     
	   //to get text from main page, need to switch selenium focus from child frame to main page
	     
	     driver.switchTo().defaultContent();
	     System.out.println(mainpage.getText());
	     
	}

}
