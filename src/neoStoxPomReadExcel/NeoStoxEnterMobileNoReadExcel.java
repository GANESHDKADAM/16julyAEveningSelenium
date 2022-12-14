package neoStoxPomReadExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonMethods.commonlyMethodUse;

public class NeoStoxEnterMobileNoReadExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		
				
		// create path of excelsheet
		
		File myfile= new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\16 July A Evening Batch.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet7");
		String enterno = mysheet.getRow(0).getCell(0).getStringCellValue();
	
		
		// create an object of neostoxmobilenopage
		
		NeoStoxEnterMobileNoPage emobileno= new NeoStoxEnterMobileNoPage(driver);
		emobileno.entermobileno(enterno, driver);
		emobileno.clicksignupbutton();
		commonlyMethodUse.implicitwait(driver,3000);
		// create an object of neostoxenterpasswordpage
		
		NeoStoxEnterPasswordPage password= new NeoStoxEnterPasswordPage(driver);
		password.enterpassword(mysheet.getRow(0).getCell(1).getStringCellValue(), driver);
		commonlyMethodUse.implicitwait(driver, 3000);
		password.clickonsubmitbutton();
		commonlyMethodUse.implicitwait(driver, 3000);
	
		
		// create an object of neostoximportancePage
		
		NeoStoxImportancePage clickon = new NeoStoxImportancePage(driver);
		
		commonlyMethodUse.implicitwait(driver, 500);
		
		clickon.clickonclosebutton();
		
		// create an object of neostoximportancePage
		NeoStoxImortance clikdetails= new NeoStoxImortance(driver);
		commonlyMethodUse.implicitwait(driver, 500);
		
		clikdetails.closebtn();
		
		
		
		
		
		
		
		

	}

}
