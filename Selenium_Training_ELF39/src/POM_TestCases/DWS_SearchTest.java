package POM_TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import POM_Pages.DWS_SearchPage;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_RegisterPage;

public class DWS_SearchTest extends Base_Test{
		
		@DataProvider(name="TestData")
		public Object[][] testdata() throws IOException{
			Object[][] data=Utility_Methods.getTestData("DWS_Search");
			return data;
		}
		
		@Test(dataProvider="TestData")
		public void Register(String product) {
			DWS_HomePage hp=new DWS_HomePage(driver);
			hp.click_search();
			
			DWS_SearchPage sp=new DWS_SearchPage(driver);
			sp.Enter_Product_In_SearchField(product);
	}

}
