package selenium_assignment;
//launch,navigate,select 3 cars

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Demo_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/prathiksha/Documents/Selenium%20Tyss/demo.html");
		driver.manage().window().maximize();
		
		//identify web element of select type
		WebElement select_cars=driver.findElement(By.id("standard_cars"));
		
		//creating object for select class
		Select s=new Select (select_cars);
		
		//select by visible text
		s.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		//select by value
		s.selectByValue("for");
		Thread.sleep(2000);
		
		//select by index
		s.selectByIndex(5);
	}

}
