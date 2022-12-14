package upstoxPomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxHomePage 
{
	@FindBy(xpath = "//span[text()='ganesh k.']") private WebElement GaneshA;
	
	@FindBy(id = "funds") private WebElement funds;
	
	public upstoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void getGanesh()
	{
		
		System.out.println(GaneshA.getText());
	}
	public void clickfunds()
	{
		funds.click();
	}

}
