package POM_TestCases;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import POM_Pages.DWS_NewsletterSubscribePage;
import POM_Pages.DWS_HomePage;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DWS_NewsletterSubscribeTest extends Base_Test{

		@DataProvider(name="Testdata")
		public Object[][] testdata() throws IOException {
			
			Object[][]data=Utility_Methods.getTestData("DWS_NL_Subscribe");
			
			return data;
		}
		
		@Test(dataProvider = "Testdata")
		public void Newsletter(String email) {
			DWS_NewsletterSubscribePage sub=new DWS_NewsletterSubscribePage(driver);
			sub.enter_subscribe_field(email);
			sub.click_subscribe();
		
		}
}
