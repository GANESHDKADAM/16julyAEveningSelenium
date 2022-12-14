package waitsInSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import commonMethods.commonlyMethodUse;

public class fluentWaitInSelenium 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		//Thread.sleep(1000);
		// using dynamic wait-->fluent Wait
		
	    Wait<WebDriver> Wait= new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(50))
	    		.pollingEvery(Duration.ofSeconds(50))
	    		.ignoring(NoSuchElementException.class);
	    driver.findElement(By.id("userCode")).sendKeys("6WB43B");
		driver.findElement(By.name("password")).sendKeys("Ganesh@25");
	    WebElement locator = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")));
	    locator.click();
	    commonlyMethodUse.fluentwait(driver);
	    driver.findElement(By.name("yob")).sendKeys("1993");

	}

}
