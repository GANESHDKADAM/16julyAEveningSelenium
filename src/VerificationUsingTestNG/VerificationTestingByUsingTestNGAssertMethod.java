package VerificationUsingTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonMethods.commonlyMethodUse;
import dev.failsafe.internal.util.Assert;

public class VerificationTestingByUsingTestNGAssertMethod 
{
  @Test
  public void testing() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://vctcpune.com/selenium/practice.html");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      WebElement text = driver.findElement(By.xpath("//legend[text()='Checkbox Example']"));
      System.out.println(text.getText());
      commonlyMethodUse.scorllIntoView(driver, text);
      WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
      checkbox1.click();
      org.testng.Assert.assertTrue(checkbox1.isSelected(),"checkbox1 is not selected then TC is failed");
      
      
	  
  }
}
