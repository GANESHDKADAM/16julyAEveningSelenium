package excelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelReadAll 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		File myfile= new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\16 July A Evening Batch.xlsx");
		// read all excel sheet through selenium
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet2");
		for(int i=0; i<=13;i++)
		{
			for(int j=0;j<=14;j++)
			{
				String allreadsheet = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(allreadsheet+"     ");
			}
			System.out.println();
		}

	}

}
