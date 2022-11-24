package testng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop_Search {
	@Test
	public void search() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("books");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}

}
