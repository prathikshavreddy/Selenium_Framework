package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;

public class DataProviders_2D_Register {
	@DataProvider(name="TestData")
	public Object[][] testdata() {
		/*Object[][] data=new Object[5][5];//creating an object
		data[0][0]="prathi";
		data[0][1]="reddy";
		data[0][2]="prathi@gmail.com";
		data[0][3]="100001";
		data[0][4]="100001";
		
		data[1][0]="mehek";
		data[1][1]="muni";
		data[1][2]="muni@gmail.com";
		data[1][3]="100002";
		data[1][4]="100002";
		
		data[2][0]="amruta";
		data[2][1]="ammu";
		data[2][2]="ammu@gmail.com";
		data[2][3]="100003";
		data[2][4]="100003";
		
		data[3][0]="nimita";
		data[3][1]="nimmi";
		data[3][2]="nimmi@gmail.com";
		data[3][3]="100004";
		data[3][4]="100004";
		
		data[4][0]="sanjana";
		data[4][1]="sanju";
		data[4][2]="sanju@gmail.com";
		data[4][3]="100005";
		data[4][4]="100005";*/
		
		Object[][] data=new Object[1][5];//creating an object
		data[0][0]="prathi";
		data[0][1]="reddy";
		data[0][2]="prathi@gmail.com";
		data[0][3]="100001";
		data[0][4]="100001";
		
		return data;
	}
		
	@Test(dataProvider="TestData")
	public void testdataregister(String firstname,String lastname,String email,String password,String confirmpassword) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(confirmpassword);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.close();
	}
}