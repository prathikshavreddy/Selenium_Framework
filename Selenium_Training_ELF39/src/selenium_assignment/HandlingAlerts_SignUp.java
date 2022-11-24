package selenium_assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts_SignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		driver.findElement(By.name("user[full_name]")).sendKeys("prathi reddy");
		driver.findElement(By.name("user[email]")).sendKeys("prathi7@gmail.com");
		driver.findElement(By.name("user[password]")).sendKeys("prathi1234");
		driver.findElement(By.name("terms_and_conditions")).click();
		driver.findElement(By.name("submit")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
