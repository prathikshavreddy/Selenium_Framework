package POM_TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import POM_Pages.DWS_BooksPage;
import POM_Pages.DWS_HomePage;


public class DWS_BooksTest extends Base_Test{
		
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("DWS_Books");
		return data;
	}
	
	@Test(dataProvider="TestData")
		public void Books(String sort,String display,String viewas) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_books();
			
		DWS_BooksPage bp=new DWS_BooksPage(driver);
		bp.click_books();
		bp.select_sortby(sort);
		bp.select_display(1);
		bp.select_view_as(viewas);
	}
		
}
