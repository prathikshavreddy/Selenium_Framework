package selenium_assignment;
//launch click on login inside frame using index

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_DemoWebShop_Login {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/prathiksha/Documents/Selenium%20Tyss/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		
		//identify the frame n swtich to it
		//switch the frame by index
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.close();
	}

}
