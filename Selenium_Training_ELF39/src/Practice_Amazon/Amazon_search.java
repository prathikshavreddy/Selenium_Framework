package Practice_Amazon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class Amazon_search extends Base_Test{
	
	@DataProvider(name ="TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Search");
		return data;
	}
	
	@Test(dataProvider="TestData")
	public void amazon(String product) {
		WebElement search_click=driver.findElement(By.name("field-keywords"));
		Utility_Methods.Click_Element(search_click);
		
		WebElement enter_text=driver.findElement(By.name("field-keywords"));
		Utility_Methods.Enter_Value_In_Edit_Field(enter_text, product);
		
		WebElement search_submit=driver.findElement(By.cssSelector("//input[type='submit']")); 
		Utility_Methods.Click_Element(search_submit);

	}
}
