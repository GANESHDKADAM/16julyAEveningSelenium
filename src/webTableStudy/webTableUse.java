package webTableStudy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableUse 
{

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		// how many row in table
		
		List<WebElement> totalrow = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("Total no of row present in webtable is "+totalrow.size());
		System.out.println("=======================================");
		// how many column in table
		
		List<WebElement> totalcolumn = driver.findElements(By.xpath("//table[@id='product']//tr/th"));
		System.out.println("total no of column present in webtable is "+totalcolumn.size());
		System.out.println("=======================================");
		//how to read specific data
		String myspecifictext = driver.findElement(By.xpath("//table[@id='product']//tr[10]/td[2]")).getText();
		System.out.println("My specific text is "+myspecifictext);
		//how to read whole row using findElements
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("================using for each loop=======================");
		List<WebElement> rowno9 = driver.findElements(By.xpath("//table[@id='product']//tr[9]/td"));
		Iterator<WebElement> rn9 = rowno9.iterator();
		while(rn9.hasNext())
		{
			System.out.print(rn9.next().getText()+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("=================using for loop only======================");
		//how to read whole row using findElement
		for(int i=1;i<=3; i++)
		{
			String row11 = driver.findElement(By.xpath("//table[@id='product']//tr[11]/td["+i+"]")).getText();
			System.out.print(row11 +" ");
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("==================using nested for loop =====================");
		//i need to pickup rows--->varying from -->2-11
		for(int i=2;i<=11;i++)
		{
			//now pick up columns from perticuler row--> varying from 1->3
			for (int j=1;j<=3;j++)
			{
				String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text +" ");
				
			}
			System.out.println();
			System.out.println("================using if condition=======================");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		//i need to pickup rows--->varying from -->1-11
		for(int i=1;i<=11;i++)
		{
			//now pick up columns from perticuler row--> varying from 1->3
			for(int j=1; j<=3;j++)
			{
				if(i==1)
				{
					
					String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(text +" ");
				}
				else
				{
					String text = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(text +" ");
				}
				
			}
			System.out.println();

			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("================using only iterator with findelements method=======================");
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		for(WebElement tbl:table)
		{
			System.out.print(tbl.getText()+ " ");
			System.out.println();
		}
		


		
		
		
		
		
		
		

	}

}
