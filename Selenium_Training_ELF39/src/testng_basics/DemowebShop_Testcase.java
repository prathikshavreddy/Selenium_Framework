package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;

public class DemowebShop_Testcase extends Base_Test{
	
	@Test
	public void register() {
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("prathi");
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("reddy");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prathi001@gmail.com");
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
}
	
	@Test
	public void login(){
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prathi001@gmail.com");
		//driver.findElement(By.id("Email")).sendKeys("prathi001@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
		//driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();	
	
}
	
	@Test
	public void search() {
	
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Test
	public void advancesearch(){
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Books");
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
		driver.findElement(By.xpath("//input[@id='Pf']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@id='Pt']")).sendKeys("500");
		driver.findElement(By.id("Sid")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
	
	@Test
	public void computer(){
		
		//to mouse over on computers
		WebElement computers=driver.findElement(By.linkText("Computers"));
		Actions action=new Actions(driver);
		action.moveToElement(computers).click().sendKeys("Accessories").build().perform();
		
	}
}