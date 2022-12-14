package upstoxStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxExa2ThroughreadExcel 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login-v2.upstox.com/");
			Thread.sleep(1000);
			File myfile= new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\16 July A Evening Batch.xlsx");
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet4");
			String valuestring = mysheet.getRow(1).getCell(0).getStringCellValue();
			WebElement username = driver.findElement(By.id("userCode"));
	        username.sendKeys(valuestring);
			Thread.sleep(1000);
			//String passwvalue = mysheet.getRow(1).getCell(1).getStringCellValue();
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys(mysheet.getRow(1).getCell(1).getStringCellValue());
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
			Thread.sleep(1000);
		    WebElement valueofbirthyear = driver.findElement(By.name("yob"));
		    valueofbirthyear.sendKeys(mysheet.getRow(1).getCell(2).getStringCellValue());
			Thread.sleep(10000);
			driver.findElement(By.xpath("(//div[@class='_2k4Zlk-e-Xvq7tMQ6fDfoP'])[1]")).click();
			Thread.sleep(1000);
			String actualusername = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
			String expectedusername="Kunal A.";
			if(actualusername.equals(expectedusername))
			{
				System.out.println("user name is matching test case is pass");
			}
			else
			{
				System.out.println("user name is not matching test case is fail");
			}
			Thread.sleep(10000);
			driver.findElement(By.id("funds")).click();
			Thread.sleep(10000);
			String availablefund = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
			System.out.println("available fund is "+availablefund);
			Thread.sleep(10000);


	}

}
