package selenium_assignment;
//launch click on login inside frame using webelement attribute

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_DemoWebShop_WebElement_Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/prathiksha/Documents/Selenium%20Tyss/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement books=driver.findElement(By.id("FR1")); //
		driver.findElement(By.id("small-searchterms")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}

}
