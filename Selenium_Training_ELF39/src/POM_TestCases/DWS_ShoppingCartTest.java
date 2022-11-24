package POM_TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_RegisterPage;

public class DWS_ShoppingCartTest extends Base_Test{
	
	@Test
	public void ShoppinCartTest() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_shopping_kart();
	}
}