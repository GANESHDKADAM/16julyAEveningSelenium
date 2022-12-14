package upstoxPomReadExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.commonlyMethodUse;
import net.bytebuddy.asm.Advice.Return;

public class upstoxHomePage 
{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userid;
	@FindBy(id = "funds") private WebElement clickfunds;
	@FindBy(id = "//div[@id='logout']") private WebElement logout;
	
	public upstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void getuserid(String UI,WebDriver driver) throws IOException
	{
		String actualtext = userid.getText();
		//commonly mehtod used and takesscreen shot
		
		commonlyMethodUse.takeScreenShot(driver, actualtext);
		
		if(actualtext.equals(UI))
		{
			System.out.println("actual and expected username is matching test case is pass");
		}
		else
		{
			System.out.println("actual and expected username is not matching test case is fail");
		}
		
	}
	public void clickonfundsbuttun()
	{
		clickfunds.click();
	}
	public void logoutbuttun() throws InterruptedException
	{
		userid.click();
		Thread.sleep(1000);
		//logout.click();
	}
	public String getActualUserID(WebDriver driver) throws IOException
	{
		String actualuserid = userid.getText();
		commonlyMethodUse.implicitwait(driver, 1000);
		//scroll to view
		commonlyMethodUse.scorllIntoView(driver, userid);
		//Take Screenshot
		commonlyMethodUse.takeScreenShot(driver, actualuserid);
		return actualuserid;
	}

}
