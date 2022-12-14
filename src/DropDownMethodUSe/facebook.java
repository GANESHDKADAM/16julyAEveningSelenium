package DropDownMethodUSe;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		WebElement birthdate = driver.findElement(By.id("day"));
		Thread.sleep(3000);
		Select bd= new Select(birthdate);
		Thread.sleep(3000);
		bd.selectByVisibleText("1");
		Thread.sleep(3000);
		List<WebElement> bday = bd.getOptions();
		Thread.sleep(3000);
		
		System.out.println("date of birth is one month "+bday.size());
		Thread.sleep(10000);
		System.out.println("=========for each loop==================");
		for(WebElement birth:bday)
		{
			System.out.println(birth.getText());
		}
		Thread.sleep(3000);
		System.out.println("=======================================");
		WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Thread.sleep(3000);
		Select bm= new Select(birthmonth);
		Thread.sleep(3000);
		bm.selectByValue("2");
		Thread.sleep(3000);
		List<WebElement> monthofbirth = bm.getOptions();
		Thread.sleep(3000);
		System.out.println("month of year is "+monthofbirth.size());
		Thread.sleep(3000);
		System.out.println("=========iterator==================");
		Iterator<WebElement> mob = monthofbirth.iterator();
		while(mob.hasNext())
		{
			System.out.println(mob.next().getText());
		}
		Thread.sleep(3000);
		System.out.println("=======================================");
		WebElement birthyear = driver.findElement(By.id("year"));
		Thread.sleep(3000);
		Select by= new Select(birthyear);
		Thread.sleep(3000);
		by.selectByIndex(3);
		Thread.sleep(3000);
		List<WebElement> year = by.getOptions();
		Thread.sleep(3000);
		System.out.println("total no of year is "+year.size());
		Thread.sleep(3000);
		System.out.println("=========for each loop==================");
		for(WebElement boy:year)
		{
			System.out.println(boy.getText());
		}
		
	}

}


