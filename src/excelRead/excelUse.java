package excelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.io.FileHandler;

public class excelUse 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File myfile= new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\16 July A Evening Batch.xlsx");
		
		// how to read specific row and cell only
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		String first = mysheet.getRow(0).getCell(0).getStringCellValue();
		System.out.print(first);
		System.out.println();
		System.out.println("=========================READ ONLY FIRST CELL=======================");
		String first1 = mysheet.getRow(0).getCell(4).getStringCellValue();
		System.out.println(first1);
		System.out.println();
		System.out.println("======================READ ONLY NUMERIC VALUE==========================");
		double firstnumber = mysheet.getRow(1).getCell(5).getNumericCellValue();
		System.out.println(firstnumber);
		System.out.println("======================READ ONLY SPECIFIC ROW==========================");
	//	boolean firstboolean = mysheet.getRow(0).getCell(8).getBooleanCellValue();
	//	System.out.println(firstboolean);
	//	System.out.println("================================================");
		
		// how to read whole row
		
		Sheet sheet = WorkbookFactory.create(myfile).getSheet("sheet1");
		for(int i=0; i<=7;i++)
		{
			
			String mainsheet = sheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(mainsheet+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("=====================READ ALL EXCEL SHEET===========================");
		System.out.println();
		Sheet sheet1 = WorkbookFactory.create(myfile).getSheet("sheet2");
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=4;j++)
			{
				String readtotalsheet = sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(readtotalsheet+"     ");
			}
			System.out.println();
		}
		
		
	}

}
