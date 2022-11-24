package POM_TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import POM_Pages.DWS_AdvanceSearchPage;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_HomePage;

public class DWS_AdvanceSearchTest extends Base_Test{

	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("DWS_AdvanceSearch");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void  AdvanceSerach(String Product,String category,String manufacture,String From_Price,String To_price){
	DWS_HomePage hp=new DWS_HomePage(driver);
	hp.click_search();
	
	DWS_AdvanceSearchPage ASp=new DWS_AdvanceSearchPage(driver);
	ASp.Enter_product_Asearch(Product);
	ASp.Enter_Aclick();
	ASp.click_Asearch();
	ASp.category_Asearch(category);
	ASp.maufacture_Asearch(manufacture);
	ASp.from_price(From_Price);
	ASp.to_price(To_price);
	ASp.A_submit();
	
	}
}
