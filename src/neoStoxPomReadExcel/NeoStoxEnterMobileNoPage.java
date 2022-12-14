package neoStoxPomReadExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.commonlyMethodUse;

public class NeoStoxEnterMobileNoPage
{
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement entermobileno;
	@FindBy(id ="lnk_signup1") private WebElement clicksignup;
	
	public NeoStoxEnterMobileNoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void entermobileno(String mobile,WebDriver driver) throws IOException
	{
		commonlyMethodUse.takeScreenShot(driver, mobile);
		entermobileno.sendKeys(mobile);
	}
	public void clicksignupbutton() 
	{
		
		clicksignup.click();
	}

}
