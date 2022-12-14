package FindElementMethodUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabledMethodUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.discoveryplus.in/");
         Thread.sleep(10000);
         driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
         Thread.sleep(100);
         //driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9890726121");
         //Thread.sleep(100);
        // WebElement GetOtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
         
         //System.out.println(GetOtpButton.isEnabled());
         

	}

}
