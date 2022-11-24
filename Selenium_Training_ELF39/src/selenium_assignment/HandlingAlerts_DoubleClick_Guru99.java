     package selenium_assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlerts_DoubleClick_Guru99 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement double_click=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		Actions action=new Actions(driver);
		action.doubleClick(double_click).build().perform();
		Thread.sleep(2000);
		
		//switching the alert
		
		Alert a=driver.switchTo().alert();
		
		//to get text from alert
		System.out.println(a.getText());
		
		//handling alert
		a.accept();
		driver.close();
		}

}
