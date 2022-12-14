package senkeysAndClickStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.commonlyMethodUse;

public class sendkeysAndClick 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		commonlyMethodUse.implicitwait(driver, 100);
		
		//javascript using sendkeys
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement entername = driver.findElement(By.id("autocomplete"));
		commonlyMethodUse.scorllIntoView(driver, entername);
		js.executeScript("arguments[0].value='GaneshKadam'",entername);
		commonlyMethodUse.explicitwait(driver, 100);
		
		//javascript using click
		
		WebElement clickoncheckbox = driver.findElement(By.id("checkBoxOption1"));	
		
		js.executeScript("arguments[0].click();",clickoncheckbox);
		
		
		

	}

}
