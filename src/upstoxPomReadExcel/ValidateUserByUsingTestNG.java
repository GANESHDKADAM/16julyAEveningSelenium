package upstoxPomReadExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethods.commonlyMethodUse;

public class ValidateUserByUsingTestNG 
{
	WebDriver driver;
	File myfile;
	Sheet mysheet;
	upstoxLoginPage login;
	upstoxPasscodePage passco;
	upstoxWelcomePage welcomePage;
	upstoxHomePage homepage;
	
	@BeforeClass
	public void lunchBrowser() throws EncryptedDocumentException, IOException
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://login-v2.upstox.com/");
	 commonlyMethodUse.implicitwait(driver, 1000);
	 Reporter.log("lunching uptox browser",true);
	 login = new upstoxLoginPage(driver);
	 passco = new upstoxPasscodePage(driver);
	 welcomePage = new upstoxWelcomePage(driver);
	 homepage = new upstoxHomePage(driver);
	 myfile= new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\16 July A Evening Batch.xlsx");
     mysheet = WorkbookFactory.create(myfile).getSheet("sheet6");
	}
	@BeforeMethod
	public void loginUptox() throws IOException
	{
		login.enteruserid(mysheet.getRow(0).getCell(0).getStringCellValue(), driver);
		login.enterpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.clickonsubmitbuttun();
		Reporter.log("sending the username,passowrd and click on submitbutton",true);
		commonlyMethodUse.implicitwait(driver, 1000);
		passco.enterpasscodepage(mysheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("sending the passcode",true);
		commonlyMethodUse.implicitwait(driver, 5000);
		welcomePage.imgood();
		Reporter.log("cliking the imgood", true);
		commonlyMethodUse.implicitwait(driver, 5000);
	}
  @Test
  public void ValidateUser() throws IOException 
  {
	  String expecteduserid = mysheet.getRow(0).getCell(3).getStringCellValue();
	  String actualuserid = homepage.getActualUserID(driver);
	  Assert.assertEquals(actualuserid, expecteduserid,"actual and expecteduserid are not same then TC is failed");
	  Reporter.log("Valiate the user id and scrollinto userid then take screenshoot of actualuserid",true);
	  
  }
  @AfterMethod
  public void logoutUptox() throws InterruptedException
  {
	  homepage.logoutbuttun();
	  Reporter.log("loging out from upstoxpage",true);
	  
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("closing the browser which is open by selenium tool", true);
	  driver.close();
	  
  }
}
