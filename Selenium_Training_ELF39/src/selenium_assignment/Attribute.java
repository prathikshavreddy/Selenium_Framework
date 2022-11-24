package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//get attriute method
		String attribute=driver.findElement(By.linkText("Register")).getAttribute("class");
		System.out.println(attribute);
		String attribute1=driver.findElement(By.linkText("Shopping cart")).getAttribute("class");
		System.out.println(attribute1);
		String attribute2=driver.findElement(By.linkText("Wishlist")).getAttribute("class");
		System.out.println(attribute2);
		
		//get css value method
		String attribute3=driver.findElement(By.className("ico-register")).getCssValue("background-clip");
		System.out.println(attribute3);
		String attribute4=driver.findElement(By.className("ico-register")).getCssValue("background-color");
		System.out.println(attribute4);
		
		driver.close();
	}

}
