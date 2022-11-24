package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_2D_AdvanceSearch {
		@DataProvider(name="TestData")
		public Object[][] testdata() {
			/*Object[][] data=new Object[5][3];//creating an object
		
			data[0][0]="books";
			data[0][1]="100";
			data[0][2]="500";
			
			data[1][0]="mobiles";
			data[1][1]="100";
			data[1][2]="200";
			
			data[2][0]="computers";
			data[2][1]="100";
			data[2][2]="500";
			
			data[3][0]="jewelry";
			data[3][1]="100";
			data[3][2]="500";
			
			data[4][0]="digital downloads";
			data[4][1]="100";
			data[4][2]="500";*/
			
			Object[][] data=new Object[1][3];//creating an object
			
			data[0][0]="books";
			data[0][1]="100";
			data[0][2]="500";
			
			return data;
		}
			
		@Test(dataProvider="TestData")
			public void testdatalogin(String advance_search,String start_price,String end_price ){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys( advance_search);
				driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
				
				driver.findElement(By.id("As")).click();
				
				WebElement search=driver.findElement(By.id("Cid"));
				Select s=new Select(search);
				s.selectByVisibleText("Books");
				
				driver.findElement(By.id("Isc")).click();
				WebElement search1=driver.findElement(By.id("Mid"));
				Select s1=new Select(search1);
				s1.selectByVisibleText("Tricentis");
				
				driver.findElement(By.id("Pf")).click();
				driver.findElement(By.xpath("//input[@id='Pf']")).sendKeys(start_price);
				driver.findElement(By.xpath("//input[@id='Pt']")).sendKeys(end_price);
				driver.findElement(By.id("Sid")).click();
				driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
				driver.close();
		}
}