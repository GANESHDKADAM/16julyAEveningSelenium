package excelRead;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelread1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile= new File("C:\\Users\\User\\Downloads\\selenium-java-4.4.0\\16 July A Evening Batch.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet3");
		int totalnoofrow = mysheet.getLastRowNum();
		int totalnoofcell = mysheet.getRow(0).getLastCellNum()-1;
		//outer for loop>>rows
		for(int i=0; i<=totalnoofrow;i++)
		{
			//inner for loop>>cells
			for(int j=0; j<=totalnoofcell;j++)
			{
				CellType datatype = mysheet.getRow(i).getCell(j).getCellType();
				
				if(datatype==CellType.STRING)
				{
					String value = mysheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value +"    ");
				}
				else if(datatype==CellType.NUMERIC)
				{
					double value = mysheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value +"    ");
				}
				else if(datatype==CellType.BOOLEAN)
				{
					boolean value = mysheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value + "    ");
				}
			}
			System.out.println();
		}

	}

}
