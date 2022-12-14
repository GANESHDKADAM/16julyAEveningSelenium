package upstoxPomStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxloginpagewithmainmethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		
		// create object of upstoxloginpage
		upstoxLoginPage login= new upstoxLoginPage(driver);
		login.userid();
		login.password();
		login.submitButtun();
		
		Thread.sleep(5000);
		
		// create object of passcode
		
		upstoxPasscode birthyear= new upstoxPasscode(driver);
		birthyear.passcode();
		Thread.sleep(10000);
		
		
		// create object of welcome to pro3
		
		upstoxWelcomeToPro3 imgoodclick= new upstoxWelcomeToPro3(driver);
		imgoodclick.imgood();
		
		// create object of home page
		
		upstoxHomePage gettextandclickfunds= new upstoxHomePage(driver);
		gettextandclickfunds.getGanesh();
		
		gettextandclickfunds.clickfunds();
		Thread.sleep(5000);
		
		// create object of MyAccountFunds
		
		upstoxMyAccountFunds balance= new upstoxMyAccountFunds(driver);
		balance.myaccountfunds();

	}

}
