package POM_TestCases;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import POM_Pages.DWS_HomePage;

public class DWS_JewelryTest extends Base_Test{
	
		@Test
		public void TC11() {
			DWS_HomePage hp=new DWS_HomePage(driver);
			hp.click_jewelry();

	}
}


