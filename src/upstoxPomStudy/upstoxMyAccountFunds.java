package upstoxPomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxMyAccountFunds 
{
	@FindBy(xpath = "((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]") private WebElement availabletotrade;
	
	public upstoxMyAccountFunds(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void myaccountfunds()
	{
		//availabletotrade.getText()
		System.out.println("my fund is available to trade is "+availabletotrade.getText());
	}

}
