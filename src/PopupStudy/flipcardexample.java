package PopupStudy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcardexample 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("i phone 14");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(10000);
		String review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
		System.out.println("=========================================");
		System.out.println("Today Review are "+review);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title='Samsung']")).click();
		Thread.sleep(10000);
		String ratingis = driver.findElement(By.xpath("((//div[@class='_4ddWXP _3BCh3_'])[1]//span)[1]")).getText();	
		Thread.sleep(1000);
		System.out.println("=========================================");
		System.out.println("Todays Rating is "+ratingis);	
		System.out.println("=========================================");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total no of images in samsung mobile is "+images.size());
		System.out.println("=========================================");
		
		
		
		
		
		
		

	}

}
