package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_2D_Search {
		@DataProvider(name="TestData")
		public Object[][] testdata() {
			/*Object[][] data=new Object[5][1];//creating an object
		
			data[0][0]="books";
			
			data[1][0]="mobiles";
			
			data[2][0]="computers";
			
			data[3][0]="jewelry";
			
			data[4][0]="digital downloads";*/
			
			Object[][] data=new Object[1][1];//creating an object
			
			data[0][0]="books";
			
			return data;
		}
			
		@Test(dataProvider="TestData")
			public void testdatalogin(String search){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys(search);
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.close();
		}
}