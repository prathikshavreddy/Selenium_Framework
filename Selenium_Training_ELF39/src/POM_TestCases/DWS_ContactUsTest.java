package POM_TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import POM_Pages.DWS_ContactUsPage;
import POM_Pages.DWS_HomePage;

public class DWS_ContactUsTest extends Base_Test{
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("DWS_ContactUs");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void Register(String name,String email,String enquiry) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_contact_us();
		
		DWS_ContactUsPage cp=new DWS_ContactUsPage(driver);
		cp.enter_name(name);
		cp.enter_email(email);
		cp.enter_enquiry(enquiry);
	}
}
