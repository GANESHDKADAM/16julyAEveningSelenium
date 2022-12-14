package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTest 
{
	WebDriver driver;
	@Parameters("browserName")
  @Test
  
  public void BrowserTesting(String bname) 
  {
		
	  if(bname.equals("Firefox"))
	  {
		  
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\geckodriver.exe");
		   driver= new FirefoxDriver();
		  
	  }
	 else if(bname.equals("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
			
			 driver=new ChromeDriver(); 
	  }
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  
  }
}
