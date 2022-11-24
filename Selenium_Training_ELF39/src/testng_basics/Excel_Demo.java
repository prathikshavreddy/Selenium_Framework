package testng_basics;

//count rows and columns
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Demo {

		@Test
		public void exceldemo() throws IOException {
			
			//file path
			String filepath="./TestData/Test_data.xlsx";
			
			FileInputStream fis=new FileInputStream (filepath);
			
			//create object for excel file
			Workbook book=new XSSFWorkbook(fis); //downcasting
			
			//access the sheet
			Sheet sheet=book.getSheet("Sheet1");
			
			//access row and cell
			String value=sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(value);
			System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
			
			System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
			System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		}
}
