package testng_basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_EntireSheet_Object2D {

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
		 
		Object [][] data=new Object[row_count-1][column_count];
		
		//print all the rows and columns except header
		for(int row=1;row<row_count;row++) {
			for (int col=0;col<column_count;col++) {
				//System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
				data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
			}
			System.out.println();
		}
		
		//print values present in data object
		for(int i=0;i<=data.length-1;i++) {
			for(int j=0;j<=data[i].length-1;j++) {
				System.out.println(data[i][j]);
			}
		}
	}
}
