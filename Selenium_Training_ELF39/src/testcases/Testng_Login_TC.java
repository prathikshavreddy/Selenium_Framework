package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;


public class Testng_Login_TC extends Base_Test{

	@DataProvider(name= "TestData")
	public Object[][] testdata() throws IOException{
		/*Object[][] data=new Object[1][2];
		data[0][0]="prathi@gmail.com";
		data[0][1]="100001";*/
		
		Object[][] data=Utility_Methods.getTestData("Login");
		return data;		
	}
	
	@Test(dataProvider = "TestData")
	public void login(String email,String password) {
			//driver.findElement(By.linkText("Log in")).click();
			WebElement login_link=driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
			//Click_Element(login_link);
			Utility_Methods.Click_Element(login_link);
			
			//driver.findelement(by.id("email")).sendkeys("prathi@gmail.com");
			WebElement un=driver.findElement(By.id("Email"));
			Utility_Methods.Enter_Value_In_Edit_Field(un, email);
			
		
			//driver.findElement(By.id("Password")).sendKeys("100001");
			WebElement pwd=driver.findElement(By.id("Password"));
			Utility_Methods.Enter_Value_In_Edit_Field(pwd,password);
			
			//driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
			WebElement submit=driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
			Utility_Methods.Click_Element(submit);
			
			WebElement logout_link=driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
			Utility_Methods.Click_Element(logout_link);
		}
			
}
