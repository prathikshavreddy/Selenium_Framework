package selenium_assignment;
//launch click on login inside frame using ID attribute

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_DemoWebShop_IdAttribute_Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/prathiksha/Documents/Selenium%20Tyss/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame("FR1");
		//driver.findElement(By.xpath("//input")).click();
		//driver.findElement(By.xpath("//input")).sendKeys("Books");
		//driver.findElement(By.className("button-1 search-box-button")).click();
		driver.findElement(By.id("small-searchterms")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
	}

}
