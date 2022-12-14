package upstoxPomReadExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxPomReadWithExcel 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
				
		// create path of excelsheet
		
		File myfile= new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\16 July A Evening Batch.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet4");
		String username = mysheet.getRow(1).getCell(0).getStringCellValue();
		
		//create object of upstoxlogin page
		
		upstoxLoginPage login= new upstoxLoginPage(driver);
		login.enteruserid(username, driver);
		login.enterpassword(mysheet.getRow(1).getCell(1).getStringCellValue());
		login.clickonsubmitbuttun();
		Thread.sleep(2000);
		
		// create object of upstoxpasscode page
		
		upstoxPasscodePage passco= new upstoxPasscodePage(driver);
		passco.enterpasscodepage(mysheet.getRow(1).getCell(2).getStringCellValue());
		Thread.sleep(10000);
		//create object of welcome page
		upstoxWelcomePage welcomePage= new upstoxWelcomePage(driver);
		
		
		
		
		// create object of homepage
		
		upstoxHomePage homepage= new upstoxHomePage(driver);
		homepage.getuserid(mysheet.getRow(1).getCell(3).getStringCellValue(), driver);
		homepage.clickonfundsbuttun();
		Thread.sleep(2000);
		
		//crerate object of Available to trade page 
		
		upstoxMyAccountFundsPage funds= new upstoxMyAccountFundsPage(driver);
		funds.myaccountfunds(driver);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
