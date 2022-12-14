package neoStoxPomReadExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeoStoxEnterPasswordPage 
{
	@FindBy(name="ctl00$MainContent$_wp_enteraccesspin$txt_accesspin") private WebElement password;
	@FindBy(xpath="//a[@class='btn btn-neo']") private WebElement clickonsubmit;
	
	public NeoStoxEnterPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterpassword(String pass, WebDriver driver)
	{
		password.sendKeys(pass);
	}
	public void clickonsubmitbutton()
	{
		clickonsubmit.click();
	}

}
