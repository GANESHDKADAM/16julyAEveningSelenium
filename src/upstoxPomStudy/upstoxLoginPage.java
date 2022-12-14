package upstoxPomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxLoginPage 
{
	// declare the globally variable
	
	@FindBy(name = "userId")    private WebElement userid;
	@FindBy(name = "password")  private WebElement password;
	@FindBy(xpath = "//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']") private WebElement submitButtun;
	
	
	// intialise the variable
	public upstoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void userid()
	{
		userid.sendKeys("6WB43B");
		
	}
	public void password() 
	{
		password.sendKeys("Ganesh@25");
	}
	public void submitButtun()
	{
		submitButtun.click();
	}
	
	
}

