
package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class Tetsng_Register_TC extends Base_Test{
	
	@DataProvider(name= "TestData")
	public Object[][] testdata() throws IOException{
		/*Object[][] data=new Object[1][5];//creating an object
		data[0][0]="prathi";
		data[0][1]="reddy";
		data[0][2]="prathi@gmail.com";
		data[0][3]="100001";
		data[0][4]="100001";*/
		
		Object[][] data=Utility_Methods.getTestData("Register");
		return data;
	}
	
	
	@Test(dataProvider = "TestData")
	public void Register(String firstname,String lastname,String email,String pwd,String confirmpassword) {
		
		WebElement Reg_Link=driver.findElement(By.className("ico-register"));
		Utility_Methods.Click_Element(Reg_Link);
		
		
		WebElement gender=driver.findElement(By.id("gender-female"));
		Utility_Methods.Click_Element(gender);
		
	
		WebElement fname=driver.findElement(By.id("FirstName"));
		Utility_Methods.Enter_Value_In_Edit_Field(fname,firstname);
		
	
		WebElement lname=driver.findElement(By.id("LastName"));
		Utility_Methods.Enter_Value_In_Edit_Field(lname,lastname);
		
		
		WebElement mail=driver.findElement(By.name("Email"));
		Utility_Methods.Enter_Value_In_Edit_Field(mail,email);
		
		WebElement  password=driver.findElement(By.name("Password"));
		Utility_Methods.Enter_Value_In_Edit_Field(password,pwd);
		
		
		WebElement Confirm_pwd=driver.findElement(By.name("ConfirmPassword"));
		Utility_Methods.Enter_Value_In_Edit_Field(Confirm_pwd,confirmpassword);
		
		WebElement Click_Reg=driver.findElement(By.name("register-button"));
		Utility_Methods.Click_Element(Click_Reg);
		
	}

			
	
}
