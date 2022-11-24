package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MulitpleHandling_DemoWebShop_Register_WEbDriverWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		//create objet of webdriver wait
		WebDriverWait wait=new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(@class,'ico-register')]"))));
		
		driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'Gender')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("prathi");
		driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("reddy");
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("prathi1101@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@id,'ConfirmPassword')]")).sendKeys("123456");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'register-button')]"))));
		driver.findElement(By.xpath("//input[contains(@id,'register-button')]")).click();
		driver.close();
	}

}
