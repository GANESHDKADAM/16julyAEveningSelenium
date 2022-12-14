package upstoxStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxExa1 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("userCode")).sendKeys("6WB43B");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Ganesh@25");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("yob")).sendKeys("1993");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'])[1]")).click();
		Thread.sleep(1000);
		String actualusername = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
		String expectedusername="Ganesh K.";
		if(actualusername.equals(expectedusername))
		{
			System.out.println("user name is matching test case is pass");
		}
		else
		{
			System.out.println("user name is not matching test case is fail");
		}
		Thread.sleep(1000);
		driver.findElement(By.id("funds")).click();
		Thread.sleep(1000);
		String availablefund = driver.findElement(By.xpath("(((//div[@class='_2Bthrplw1VYHfLzzQv0asZ']))[1]//div)[3]")).getText();
		System.out.println("available fund is "+availablefund);

	}

}
