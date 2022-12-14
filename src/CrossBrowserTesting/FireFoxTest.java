package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\geckodriver.exe");
	   WebDriver driver= new FirefoxDriver();
	   driver.get("https://vctcpune.com/selenium/practice.html");
		  driver.manage().window().maximize();
	   
  }
}
