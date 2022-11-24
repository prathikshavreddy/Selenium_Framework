package selenium_assignment;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		
		//navigate to
		//driver.get("https://www.google.co.in");
		//driver.navigate().to("https://www.google.co.in");
		
		driver.navigate().to("https://www.amazon.co.in");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//close browser
		driver.close();
	}

}
