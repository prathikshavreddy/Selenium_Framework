package selenium_assignment;

//launch navigate click on search item n search button using classname

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo_Web_Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("button-1 search-box-button")).click();
		driver.findElement(By.className("search-box-text ui-autocomplete-input")).click();
	}

}
