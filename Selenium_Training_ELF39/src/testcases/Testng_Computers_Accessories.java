package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Framework_Utility.Base_Test;

public class Testng_Computers_Accessories extends Base_Test{

	@Test
	public void computer(){
		
		//to mouse over on computers
		WebElement computers=driver.findElement(By.linkText("Computers"));
		Actions action=new Actions(driver);
		action.moveToElement(computers).click().sendKeys("Accessories").build().perform();
		
	}
}
