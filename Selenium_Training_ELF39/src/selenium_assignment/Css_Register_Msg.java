package selenium_assignment;

//launch, navigate,actual n expected result should match n get result as successful/not

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Register_Msg {
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
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("prathi1211@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234567");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567");
		driver.findElement(By.id("register-button")).click();
		
		//validation 

		String expected="Your registration completed";
		String actual=driver.findElement(By.className("result")).getText();
		if(actual.equalsIgnoreCase(expected)){
			System.out.println("successful");
		}
		else {
			System.out.println("unsuccessful");
		}
	}

}
