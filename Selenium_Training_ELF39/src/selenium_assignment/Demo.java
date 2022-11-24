package selenium_assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/prathiksha/Documents/Selenium%20Tyss/demo.html");
		List<WebElement>radio=driver.findElements(By.xpath("//input[@type='text']"));
		for(int i=0;i<radio.size();i++) {
			if(i%2==0) {
				radio.get(i).sendKeys("prathi");
			}
			else {
				radio.get(i).sendKeys(" ");
			}
				Thread.sleep(1000);
		}
	}

}
