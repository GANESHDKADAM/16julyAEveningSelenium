package DropDownMethodUSe;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commonMethods.commonlyMethodUse;
public class Allmethoduseprogram 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{

       System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.get("https://vctcpune.com/selenium/practice.html");
       Thread.sleep(500);
       Dimension webpagesize = driver.manage().window().getSize();
       System.out.println("the size of our webpage is "+webpagesize);
       Dimension d= new Dimension(1900, 1000);
       Thread.sleep(500);
       driver.manage().window().setSize(d);
      Point webpageposition = driver.manage().window().getPosition();
       System.out.println("the position of our webpage is "+webpageposition);
       Point p= new Point(500, 300);
       Thread.sleep(500);
       driver.manage().window().setPosition(p);
       Thread.sleep(500);
       Point p1= new Point(100, 200);
       Thread.sleep(500);
       driver.manage().window().setPosition(p1);
       Thread.sleep(500);
       WebElement text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));       
       System.out.println("my text is "+text.getText());
       Thread.sleep(500);
       WebElement practicepage = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
       System.out.println(practicepage.getText());
       commonlyMethodUse.scorllIntoView(driver,practicepage);
       driver.findElement(By.id("autocomplete")).sendKeys("ganesh");
       Thread.sleep(500);
       WebElement text1 = driver.findElement(By.xpath("//legend[text()='Switch To Alert Example']"));
       System.out.println(text1.getText());
       commonlyMethodUse.scorllIntoView(driver, text1);
       driver.findElement(By.name("enter-name")).sendKeys("my name is ganesh kadam");
       commonlyMethodUse.scorllIntoView(driver,practicepage);
       driver.findElement(By.xpath("(//input[@name='radio'])[3]")).click();
       Thread.sleep(500);
       driver.findElement(By.xpath("(((//div[@class='extradiv col-lg-3 col-md-6 col-12'])[3])//input)[2]")).click();
       WebElement select = driver.findElement(By.id("dropdown-class-example"));
       Select s= new Select(select);
       s.selectByVisibleText("Option2");
       driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
       Alert alt = driver.switchTo().alert();
       alt.accept();
       WebElement specificcell = driver.findElement(By.xpath("((//table[@name='courses'])//tr)[5]"));
       System.out.println(specificcell.getText());
       WebElement text2 = driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
       System.out.println(text2.getText());
       commonlyMethodUse.scorllIntoView(driver, text2);
       driver.findElement(By.id("displayed-text")).sendKeys("Aarav Kadam");
       Thread.sleep(500);
       driver.findElement(By.id("hide-textbox")).click();
       Thread.sleep(500);
       driver.findElement(By.xpath("(//input[@class='btn-style class2'])[2]")).click();
       commonlyMethodUse.takeScreenShot(driver, "Velocityholepage");
       WebElement text3 = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
       System.out.println(text3.getText());
       commonlyMethodUse.scorllIntoView(driver, text3);
       WebElement mouse = driver.findElement(By.id("mousehover"));
       Actions act= new Actions(driver);
       act.moveToElement(mouse).perform();
       Thread.sleep(500);
        driver.findElement(By.xpath("(((//div[@class='row'])[4])//li)[2]")).click();
        WebElement text4 = driver.findElement(By.xpath("//legend[text()='Pop-up Example']"));
        System.out.println(text4.getText());
        commonlyMethodUse.scorllIntoView(driver, text4);
        driver.findElement(By.xpath("//div[contains(text(),'Click me ')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Click me ')]")).click();
        WebElement text5 = driver.findElement(By.xpath("//legend[text()='Auto Suggestive Dropdown Example']")); 
        System.out.println(text5.getText());
        text5.click();
       // WebElement district = driver.findElement(By.xpath("//datalist[@id='mah-district']"));
        //Select s1= new Select(district);
       // s1.selectByVisibleText("Aurangabad");
        driver.switchTo().frame("courses-iframe");
        WebElement text6 = driver.findElement(By.xpath("//h3[text()='For Velocity class inquiry please contact on below numbers']"));
        System.out.println(text6.getText());
        driver.switchTo().defaultContent();
        WebElement bottom = driver.findElement(By.xpath("(//a[text()='Dummy Content for Testing.'])[8]"));
        System.out.println(bottom.getText());
        commonlyMethodUse.scorllIntoView(driver, bottom);
        
        
        
      

       
       
       
       
       
       
       
       
       
       

	}

}
