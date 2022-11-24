package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_DemoWebShop_Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/computers");
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Actions action=new Actions(driver);
		//action.moveToElement(search).click().sendKeys("mobiles").perform();  //using move to element
		action.sendKeys(search, "mobiles").perform(); //using sendkeys we are performing mouse over n giving the input simultaneously
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
