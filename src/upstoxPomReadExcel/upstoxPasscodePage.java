package upstoxPomReadExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxPasscodePage 
{
	@FindBy(name = "yob") private WebElement passcode;
	
	public upstoxPasscodePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterpasscodepage(String pass)
	{
		passcode.sendKeys(pass);
	}

}
