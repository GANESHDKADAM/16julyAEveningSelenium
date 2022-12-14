package commonMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.input.Input;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonlyMethodUse 
{
	
	//1 screenshot method used
	
	public static void takeScreenShot(WebDriver driver,String name) throws IOException 
	{
	   File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File destination=new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\screenshort\\+allmethodusescreenshot+.jpg");
	   FileHandler.copy(sourceFile, destination);
		
	}
	
	// 2 scrollIntoView method
	public static void scorllIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	// 3 implicit wait method used
	public static void implicitwait(WebDriver driver,int value)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
	}
	//4 explicit wai method used
	public static void explicitwait(WebDriver driver,int value) 
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(500));
	}
	//5 fluent wait method used
	public static void fluentwait(WebDriver driver)
	{
		Wait<WebDriver> Wait= new FluentWait<WebDriver>(driver)
	    		.withTimeout(Duration.ofSeconds(50))
	    		.pollingEvery(Duration.ofSeconds(50))
	    		.ignoring(NoSuchElementException.class);
	}
	
	
	
 
}
