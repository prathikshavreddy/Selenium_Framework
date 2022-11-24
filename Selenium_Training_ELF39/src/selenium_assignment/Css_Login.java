package selenium_assignment;

//launch,navigate,click on login, enter email,password n validate that right user is logged in/not

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.co.in");
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("prathi121@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234567");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		String right_user="prathi12101@gmail.com";
		String new_user=driver.findElement(By.className("account")).getText();
		if(new_user.equalsIgnoreCase(right_user)) {
			System.out.println("valid user");
		}
		else {
			System.out.println("invalid user");
		}
		driver.close();
	}

}
