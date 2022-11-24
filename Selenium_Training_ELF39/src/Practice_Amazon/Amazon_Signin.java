package Practice_Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class Amazon_Signin extends Base_Test{
	
	@DataProvider(name ="TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void amazon(String name,String mobileno,String password, String reenter_password) throws InterruptedException{
		
		WebElement click_all=driver.findElement(By.id("nav-hamburger-menu"));
		Utility_Methods.Click_Element(click_all);
		
		WebElement sign_in=driver.findElement(By.xpath("//b[test()='Hello, sign in']"));
		Utility_Methods.Click_Element(sign_in);
		
		WebElement create_acount=driver.findElement(By.id("createAccountSubmit"));
		Utility_Methods.Click_Element(create_acount);
		
		WebElement your_name=driver.findElement(By.id("ap_customer_name"));
		Utility_Methods.Enter_Value_In_Edit_Field(your_name,name);
		
		WebElement mobile_no=driver.findElement(By.id("ap_email")); 
		Utility_Methods.Enter_Value_In_Edit_Field(mobile_no, mobileno);
		
		WebElement pwd=driver.findElement(By.id("ap_password"));
		Utility_Methods.Enter_Value_In_Edit_Field(pwd, password);
		
		WebElement re_enter=driver.findElement(By.name("passwordCheck"));
		Utility_Methods.Enter_Value_In_Edit_Field(re_enter, reenter_password);
		
		WebElement submit=driver.findElement(By.id("continue"));
		Utility_Methods.Click_Element(submit);

	}
}
