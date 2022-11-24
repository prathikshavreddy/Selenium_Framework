package POM_TestCases;

import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import POM_Pages.DWS_HomePage;
import POM_Pages.DemoWebShop_HomePage_Register.DWS_HomePage;
import java.io.IOException;

public class DWS_ApparrelTest extends Base_Test{

	@Test
	public void Apparrel() {
		DWS_HomePage hp= new DWS_HomePage(driver);
		hp.click_apparel();
	}
}
