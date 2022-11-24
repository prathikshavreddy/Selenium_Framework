package POM_TestCases;

import Framework_Utility.Base_Test;
import org.testng.annotations.Test;
import POM_Pages.DWS_HomePage;

public class DWS_ComputersTest extends Base_Test{
	
		@Test
		public void Computer() {
			DWS_HomePage hp=new DWS_HomePage(driver);
			hp.click_computers();
			
		}
	}
