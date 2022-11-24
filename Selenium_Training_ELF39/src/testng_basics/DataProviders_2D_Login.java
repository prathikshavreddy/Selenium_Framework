package testng_basics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class DataProviders_2D_Login {
		@DataProvider(name="TestData")
		public Object[][] testdata() {
			/*Object[][] data=new Object[5][2];//creating an object
		
			data[0][0]="prathi@gmail.com";
			data[0][1]="100001";
			
			data[1][0]="mehekmuni@gmail.com";
			data[1][1]="100002";
			 
			
			data[3][0]="nimitanimmi@gmail.com";
			data[3][1]="100004";
			
			data[4][0]="sanjanasanju@gmail.com";
			data[4][1]="100005";*/
			
			Object[][] data=new Object[1][2];//creating an object
			
			data[0][0]="prathi@gmail.com";
			data[0][1]="100001";
			
			return data;
		}
			
		@Test(dataProvider="TestData")
			public void testdatalogin(String username,String password){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.linkText("Log in")).click();
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
				//driver.findElement(By.id("Email")).sendKeys(username);
				driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
				//driver.findElement(By.id("Password")).sendKeys(password);
				driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();	
				driver.close();		
				}
}
