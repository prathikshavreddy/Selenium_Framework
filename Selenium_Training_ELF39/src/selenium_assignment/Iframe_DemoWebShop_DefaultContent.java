package selenium_assignment;
//launch click on login inside frame n switch back to mainpage using google link

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_DemoWebShop_DefaultContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/prathiksha/Documents/Selenium%20Tyss/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//identify the frame n switch
		WebElement books=driver.findElement(By.id("FR1"));
		driver.switchTo().frame(books);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//switch back to default content
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.close();
	}

}
