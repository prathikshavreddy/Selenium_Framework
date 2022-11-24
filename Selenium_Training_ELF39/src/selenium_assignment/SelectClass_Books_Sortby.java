package selenium_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Books_Sortby {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		//driver.findElement(By.xpath("(//a[contains(text(),'Books')")).click();
		WebElement sortby=driver.findElement(By.id("products-orderby"));
		List<WebElement>Select =new Select (sortby).getOptions();
		for(int i=0;i<Select.size();i++) {
			System.out.println(Select.get(i).getText());
		}
	}
}
