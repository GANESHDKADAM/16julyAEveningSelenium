package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitInSelenium 
{

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		//Thread.sleep(1000);
		// using dynamic wait-->explicit wait
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(500));
		driver.findElement(By.id("userCode")).sendKeys("6WB43B");
		driver.findElement(By.name("password")).sendKeys("Ganesh@25");
		WebElement clicksign = driver.findElement(By.xpath("//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']"));
		w.until(ExpectedConditions.elementSelectionStateToBe(clicksign, false));
		clicksign.click();
	
		
		
		
		

	}

}
