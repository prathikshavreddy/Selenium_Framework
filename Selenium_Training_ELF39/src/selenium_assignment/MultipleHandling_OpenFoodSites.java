package selenium_assignment;
//navigate to open food sites n print all the titles
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleHandling_OpenFoodSites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/prathiksha/Documents/Selenium%20Tyss/MultipleWindow.html");
		driver.manage().window().maximize();
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		driver.findElement(By.xpath("//input[contains(@value,'Open Food Sites')]")).click();
		Thread.sleep(2000);
		Set<String> total_window=driver.getWindowHandles();
		System.out.println(total_window);
		for(String child_window:total_window) {
			System.out.println(child_window);
			driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());
			
	}
		
	}
}
