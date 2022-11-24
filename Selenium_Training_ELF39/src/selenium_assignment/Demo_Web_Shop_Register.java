package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Web_Shop_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("prathi");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("reddy");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prathi001@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();

	}

}
