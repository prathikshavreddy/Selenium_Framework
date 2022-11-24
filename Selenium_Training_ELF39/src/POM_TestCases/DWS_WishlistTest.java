package POM_TestCases;

import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_RegisterPage;

public class DWS_WishlistTest extends Base_Test{
	
	@Test
	public void WishlistTest() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_wishlist();
	}

}
