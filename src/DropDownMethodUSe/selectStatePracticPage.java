package DropDownMethodUSe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import commonMethods.commonlyMethodUse;
import net.bytebuddy.asm.Advice.Enter;

public class selectStatePracticPage 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://vctcpune.com/selenium/practice.html");
	       Thread.sleep(500);
	       WebElement autosegestivedropdown = driver.findElement(By.xpath("//legend[text()='Auto Suggestive Dropdown Example']"));
	       System.out.println(autosegestivedropdown.getText());
	       commonlyMethodUse.scorllIntoView(driver, autosegestivedropdown);
	       WebElement enterdistrictname = driver.findElement(By.xpath("//input[@list='mah-district']"));
	       enterdistrictname.sendKeys("aurangabad");
	       Actions act= new Actions(driver);
	      act.click(enterdistrictname).perform();
	      act.keyDown(enterdistrictname,Keys.ARROW_DOWN).build().perform();
	      act.sendKeys(Keys.ENTER).perform();
	}
}
