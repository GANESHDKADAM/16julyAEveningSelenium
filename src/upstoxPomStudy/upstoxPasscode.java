package upstoxPomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webTableStudy.webTableUse;

public class upstoxPasscode 
{
	@FindBy(name = "yob") private WebElement passcode;
	
	
	
	// intialize variable
	public upstoxPasscode(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void passcode() 
	{
	    passcode.sendKeys("1993");
		
	}
	

}
