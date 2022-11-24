package selenium_assignment;
//launch navigate open parent window n go to child window n comeback to parent window , enter "mobiles" in search field
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleHandling_Facebook_Mobiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		

		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);
		Set<String> total_window=driver.getWindowHandles();
		System.out.println(total_window);
		
		for(String child_window:total_window) {
			System.out.println(child_window);
			driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());	
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				Thread.sleep(2000);
				driver.close();
			}
			driver.switchTo().window(parent_window);
			driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
			Thread.sleep(2000);
			driver.close();
			}
		
	}
	
}

