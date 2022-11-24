package selenium_assignment;

//launch navigate n complete registration

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Register_EndToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input[id=\'gender-female\']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("prathi");
		driver.findElement(By.id("LastName")).sendKeys("reddy");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("prathi123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.id("register-button")).click();
		
		
		//get text method
		String text=driver.findElement(By.linkText("Register")).getText();
		System.out.println(text);
		String text1=driver.findElement(By.cssSelector("a[href='/cart']")).getText();
		System.out.println(text1);
		String text2=driver.findElement(By.cssSelector("a[class='ico-wishlist']")).getText();
		System.out.println(text2);
	}
}
