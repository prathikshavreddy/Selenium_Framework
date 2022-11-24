package POM_TestCases;

import Framework_Utility.Base_Test;
import POM_Pages.DWS_HomePage;

import org.testng.annotations.Test;

public class DWS_DigitalDownloadsTest extends Base_Test{

	@Test
	public void Digital() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_digitaldownloads();
	}
}
