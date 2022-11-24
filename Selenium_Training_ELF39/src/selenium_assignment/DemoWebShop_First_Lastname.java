package selenium_assignment;

//to launch browser , navigate to demowebshop n click on register n enter first n last name
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoWebShop_First_Lastname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		//locator link text
		driver.findElement(By.linkText("Register")).click();
		
		//locator ID
		driver.findElement(By.id("FirstName")).sendKeys("prathi");
		
		//locator name
		driver.findElement(By.name("LastName")).sendKeys("reddy");
		driver.close();
	}

}
