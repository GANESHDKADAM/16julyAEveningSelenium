package DropDownMethodUSe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethodUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(10000);
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ganesh");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kadam");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("ganeshkadam2593@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ganeshkadam2593@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("9892726121");
		Thread.sleep(10000);
		WebElement day = driver.findElement(By.id("day"));
		Select Day= new Select(day);
		Day.selectByVisibleText("25");
		Thread.sleep(10000);
		WebElement month = driver.findElement(By.id("month"));
		Select Month= new Select(month);
		Month.selectByVisibleText("May");
		Thread.sleep(10000);
		WebElement year = driver.findElement(By.id("year"));
	    Select Year= new Select(year);
	    Year.selectByVisibleText("1993");
	    Thread.sleep(10000);
	  	driver.findElement(By.xpath("((//input[@type='radio'])[2])")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
	
	    
	    
	    
	}

}
