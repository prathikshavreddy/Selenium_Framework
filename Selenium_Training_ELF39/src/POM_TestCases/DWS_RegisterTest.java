package POM_TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_RegisterPage;

public class DWS_RegisterTest extends Base_Test{

	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("DWS_Register");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void Register(String firstname,String lastname,String mail,String pwd,String confirmpwd) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_register();
		
		DWS_RegisterPage rp=new DWS_RegisterPage(driver);
		rp.Enter_FirstName(firstname);
		rp.Enter_LaststName(lastname);
		rp.Enter_Email(mail);
		rp.Enter_Password(pwd);
		rp.Enter_ConfirmPassword(confirmpwd);	
	}
}