package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders_2D_Computers_Accessories {
			
		@Test
			public void testdatalogin(){
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demowebshop.tricentis.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//to mouse over on computers
				WebElement computers=driver.findElement(By.linkText("Computers"));
				Actions action=new Actions(driver);
				action.moveToElement(computers).click().sendKeys("Accessories").build().perform();
				driver.close();
				
		}
}