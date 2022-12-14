package upstoxPomReadExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethods.commonlyMethodUse;

public class upstoxMyAccountFundsPage 
{
	
	
      @FindBy(xpath = "((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]") private WebElement availabletotrade;
	
	public upstoxMyAccountFundsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void myaccountfunds(WebDriver driver) throws IOException
	{
		commonlyMethodUse.takeScreenShot(driver, "availabletotrade");
		//availabletotrade.getText()
		System.out.println("my fund is available to trade is "+availabletotrade.getText());
	}

}
