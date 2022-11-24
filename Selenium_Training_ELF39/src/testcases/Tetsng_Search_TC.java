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

public class Tetsng_Search_TC extends Base_Test{
	
	@DataProvider(name ="TestData")
	public Object[][] testdata() throws IOException{
		/*Object[][] data=new Object[1][1];
		data[0][0]="mobiles";*/
		
		Object[][] data=Utility_Methods.getTestData("Search");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void search(String product)
	{
		//driver.findElement(By.id("small-searchterms")).click();
		WebElement Search_click=driver.findElement(By.id("small-searchterms"));
		Utility_Methods.Click_Element(Search_click);
		
		//driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		WebElement Search_product=driver.findElement(By.id("small-searchterms"));
		Utility_Methods.Enter_Value_In_Edit_Field(Search_product,product );
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		Utility_Methods.Click_Element(submit);
	}

}
