package scrollingStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoViewExample2 
{

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		WebElement text = driver.findElement(By.xpath("(//a[text()='Dummy Content for Testing.'])[3]"));
		Thread.sleep(1000);
		/*Dimension webpagesize = driver.manage().window().getSize();
		System.out.println(webpagesize);
		Dimension di= new Dimension(700,300);
		Thread.sleep(1000);
		driver.manage().window().setSize(di);
		
		Dimension di1= new Dimension(450,250);
		Thread.sleep(1000);
		driver.manage().window().setSize(di1);*/
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", text);
		System.out.println(text.getText());
		

	}

}
