package selenium_assignment;
//launch navigate to xpath file, fill all the details using xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/prathiksha/Downloads/xpath1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("prathi");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("reddy");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("testyantra");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("bangalore");
	}

}
