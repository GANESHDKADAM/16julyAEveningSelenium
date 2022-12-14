package neoStoxPomReadExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.commonlyMethodUse;

public class WithoutUsingPom 
{

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		commonlyMethodUse.implicitwait(driver, 1000);
		driver.findElement(By.xpath("(//input[@type='number'])[1]")).sendKeys("9890726121");
		driver.findElement(By.xpath("//a[@class='btn btn-signup']")).click();
		commonlyMethodUse.implicitwait(driver, 1000);
		driver.findElement(By.id("txt_accesspin")).sendKeys("2593");
		commonlyMethodUse.implicitwait(driver, 3000);
		driver.findElement(By.xpath("(//a)[11]")).click();
		commonlyMethodUse.implicitwait(driver, 500);
		driver.findElement(By.xpath("(//a[@class='btn btn-sm neobutton'])[7]")).click();
		commonlyMethodUse.implicitwait(driver, 500);
		driver.findElement(By.xpath("(//a[@class='neobutton'])[25]")).click();
		

	}

}
