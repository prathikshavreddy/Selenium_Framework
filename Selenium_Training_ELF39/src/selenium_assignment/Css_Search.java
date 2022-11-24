package selenium_assignment;
//launch navigate, click on search store n pass input as computer 


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[type='text']")).click();
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("computer");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("computer");
		//driver.findElement(By.cssSelector("a[href='/computers']")).click();/driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("computer");
		}
}


