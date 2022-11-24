package selenium_assignment;
//launch navigate take screenshot after navigating, login n take screenshot
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_DemoWebShop_Login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//take screenshot n typecasting with driver instance
		TakesScreenshot ts=(TakesScreenshot)driver;
		File homepage=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("./screenshot/screenshot.png");
		FileHandler.copy(homepage, destination);
		
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prathi001@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
		
		File ss=ts.getScreenshotAs(OutputType.FILE);
		File destination1=new File("./screenshot/screenshot1.png");
		FileHandler.copy(ss, destination1);
		driver.close();
	}

}
