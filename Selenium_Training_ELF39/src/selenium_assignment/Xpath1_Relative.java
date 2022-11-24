package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1_Relative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/prathiksha/Documents/Selenium%20Tyss/xpath1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("prathi");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("reddy");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("testyantra");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("bangalore");
	}

}


































