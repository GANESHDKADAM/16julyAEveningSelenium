package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardUSe 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(5000);
			WebElement username = driver.findElement(By.id("email"));
			//username.sendKeys("How Are You I Am Fine Thanku");
			
			// first create the object of action class
			
			Actions act = new Actions(driver);
			
			//act.moveToElement(username).sendKeys("My Name Is Ganesh").build().perform();  // first type to enter user name throug keyboad method
			
			act.sendKeys(username, "My Name Is Lakan").perform();  // second type to enter user name through keyboard method use
			
			WebElement createaccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			act.click(createaccount).perform();
			Thread.sleep(5000);
			
			WebElement day = driver.findElement(By.id("day"));
			act.click(day).perform();
			
			// how to handle dropdown 
	
			/*act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
			act.sendKeys(Keys.ENTER).perform(); */
			
			for(int i=1; i<=20;i++)
			{
				
				act.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(500);
			}
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(500);
			
			WebElement firstname = driver.findElement(By.name("firstname"));
			WebElement lastname = driver.findElement(By.name("lastname"));
			act.moveToElement(firstname).click().sendKeys("Ganesh");
			Thread.sleep(500);
			act.keyDown(firstname, Keys.CONTROL).sendKeys("a").build().perform();
			Thread.sleep(500);
			act.sendKeys("c").perform();
			Thread.sleep(500);
			act.moveToElement(lastname).click().perform();
			act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();	
	}

}
