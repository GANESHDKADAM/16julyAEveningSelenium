package upstoxPomReadExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.commonlyMethodUse;

public class upstoxLoginPage 
{
	@FindBy(name = "userId") private WebElement userid;
	@FindBy(name = "password") private WebElement password;
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement submitbuttun;
	
	public upstoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void enteruserid(String UN,WebDriver driver) throws IOException
	{
		commonlyMethodUse.takeScreenShot(driver, "userid");
		userid.sendKeys(UN);
	}
	public void enterpassword(String Passw)
	{
		password.sendKeys(Passw);
	}
	public void clickonsubmitbuttun()
	{
		submitbuttun.click();
	}
	 

}
