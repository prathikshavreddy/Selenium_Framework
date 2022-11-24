package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Demowebshop_Books {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		WebElement sortby=driver.findElement(By.id("products-orderby"));
		Select s=new Select (sortby);
		s.selectByValue("https://demowebshop.tricentis.com/books?orderby=0");
		Thread.sleep(2000);

		WebElement display=driver.findElement(By.id("products-pagesize"));
		Select s1=new Select(display);
		s1.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement view=driver.findElement(By.id("products-viewmode"));
		Select s2=new Select(view);
		s2.selectByVisibleText("List");
		
		
	}

}
