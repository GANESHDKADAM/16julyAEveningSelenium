package neoStoxPomReadExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.commonlyMethodUse;

public class NeoStoxImportancePage 
{
	@FindBy(xpath="(//button[@type='button'])[22]") private WebElement clickon;
	
	public NeoStoxImportancePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonclosebutton()
	{
		
		clickon.click();
	}
	

}
