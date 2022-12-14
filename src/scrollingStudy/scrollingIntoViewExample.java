package scrollingStudy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.commonlyMethodUse;

public class scrollingIntoViewExample 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//commonlymethoduse by takesscreenshot
		commonlyMethodUse.takeScreenShot(driver, "velocitypage");	
		WebElement text = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		
		// scrolling into view
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",text);
		
		// commonlymethoduse by scrollintoview
		
		//commonlyMethodUse.scorllIntoView(driver, text);
		System.out.println(text.getText());
	}

}
