package selenium_assignment;
//print total no of links
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_weB_Shop_Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		driver.manage().window().maximize();
		List<WebElement>link=driver.findElements(By.xpath("//a"));
		for(int i=0;i<link.size()-1;i++) {
			System.out.println(link.get(i).getAttribute("href"));	
		}
	}

}
