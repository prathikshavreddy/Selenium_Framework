package selenium_assignment;
//launch navigate open parent window n go to child window n comeback to parent window
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleHandling_Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		driver.manage().window().maximize();
		
		//make note of parent window
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		//identify facebook link
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Thread.sleep(2000);
		Set<String> total_window=driver.getWindowHandles();
		System.out.println(total_window);
		
		for(String child_window:total_window) {
			//System.out.println(child_window);
			
			//switch to child window
			driver.switchTo().window(child_window);
			//System.out.println(driver.getTitle());
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				driver.findElement(By.name("email")).sendKeys("prathi@gmail.com");
				Thread.sleep(2000);
				
				//close the window
				driver.close();
			}
		}
		//switch back to parent window
		driver.switchTo().window(parent_window);
		driver.close();
	}

}

