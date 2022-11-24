package selenium_assignment;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlerts_RightClick_Guru99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement right_click=driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//span[contains(text(),'Edit')]/../../li/span"));
		for(int i=0;i<options.size();i++){
			action.contextClick(right_click).build().perform();
			Thread.sleep(2000);
			options.get(i).click();
			Alert a=driver.switchTo().alert();
			a.accept();
			Thread.sleep(2000);
		}
		driver.close();
	}

}
