package testNGserialParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class serialParralelTestNG 
{
  @Test
  public void FaceBookLogin() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
  }
 
 
}
