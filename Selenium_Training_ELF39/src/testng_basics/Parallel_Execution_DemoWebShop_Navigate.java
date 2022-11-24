package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Execution_DemoWebShop_Navigate {
	
	//@Test(invocationCount=3,threadPoolSize=3)
	//@Test(invocationCount=2,threadPoolSize=3)
	@Test(invocationCount=3,threadPoolSize=2)
		public void paralleldemo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launch chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}
	
}
