package upstoxPomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxWelcomeToPro3 
{
	@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement imgood;
	
	public upstoxWelcomeToPro3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void imgood()
	{
		imgood.click();
	}

}
