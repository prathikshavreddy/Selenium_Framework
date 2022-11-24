package POM_TestCases;

import Framework_Utility.Base_Test;
import POM_Pages.DWS_HomePage;

import org.testng.annotations.Test;


public class DWS_GiftCardsTest extends Base_Test{
	
		@Test
		public void Giftcards() {
			DWS_HomePage hp=new DWS_HomePage(driver);
			hp.click_giftcards();
	}
}
