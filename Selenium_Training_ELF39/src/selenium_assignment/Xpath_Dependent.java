package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Dependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//input[contains(@value,'radio3')]/..")).click();
		//driver.findElement(By.xpath("")).click();
	}

}
