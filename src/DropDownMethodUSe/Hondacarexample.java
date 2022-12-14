package DropDownMethodUSe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hondacarexample 
{

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		Thread.sleep(3000);
		System.out.println("total no of result are "+options.size());
		Thread.sleep(5000);
		System.out.println("=============for each loop=====================");
		for(WebElement result:options)
		{
			System.out.println(result.getText());
			
			String Expecter="honda bikes";
			String Actual = result.getText();
			if(Actual.equals(Expecter))
			{
				result.click();
				List<WebElement> images = driver.findElements(By.tagName("img"));
				
				System.out.println("total no of images for honda bikes is "+images.size());
				break;
			}
			
			
			
		}
		

	}

}
