package POM_TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_LoginPage;
import POM_Pages.DWS_RegisterPage;

public class DWS_LoginTest extends Base_Test{
	
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("DWS_Login");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void Register(String mail,String pwd) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_login();
		
		DWS_LoginPage lp=new DWS_LoginPage(driver);
		lp.Enter_Username(mail);
		lp.Enter_Password(pwd);
				
	}

}
