package Screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShortUse 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	      Thread.sleep(1000);
	      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      System.out.println(source);
	     File destination=new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\screenshort\\velocitypracticepage.jpg");
	     FileHandler.copy(source, destination);
	     
	     
	     
	     driver.get("https://www.facebook.com/login/");
	      Thread.sleep(1000);
	      File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      System.out.println(source1);
	     File destination1=new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\screenshort\\facebookloginpage1556645.jpg");
	     FileHandler.copy(source1, destination1);
	      

	}

}
