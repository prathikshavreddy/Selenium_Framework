package selenium_assignment;
//navigate launch click on electronics n then on camera
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Electronics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		driver.manage().window().maximize();
		
		//to identify web element on which i mouse over
		//WebElement electronic=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]")); 
		WebElement computer=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		
		//creating object for action class
		Actions action=new Actions(driver);
		//action.moveToElement(electronic).build().perform();
		action.moveToElement(computer).build().perform();
		Thread.sleep(2000);
		//action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Camera')])[1]"))).click().build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).click().build().perform();
	}

}
