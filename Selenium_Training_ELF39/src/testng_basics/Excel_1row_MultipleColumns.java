package testng_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_1row_MultipleColumns {
	
	@Test
	public void exceldemo() throws IOException {
		
		//file path
		String filepath="./TestData/Test_data.xlsx";
		
		FileInputStream fis=new FileInputStream (filepath);
		
		//create object for excel file
		Workbook book=new XSSFWorkbook(fis); //downcasting
		
		//access the sheet
		Sheet sheet=book.getSheet("Sheet1");
		
		//get row count and column count
		int row_count=sheet.getPhysicalNumberOfRows();
		int column_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(row_count);
		System.out.println(column_count);
		
		//access row and cell
		String value=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(3).getStringCellValue());
		}
}
