package neoStoxPomReadExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.commonlyMethodUse;

public class NeoStoxImortance 
{
	@FindBy(xpath="(//div[@class='col-lg-12 py-2 text-center'])[3]") private WebElement closebutton;
	
	public NeoStoxImortance(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void closebtn() 
	{
		closebutton.click();
		
	}
	

}
