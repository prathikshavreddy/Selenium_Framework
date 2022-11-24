package selenium_assignment;
//navigate launch mouse over on job search,job skill n click on java jobs
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Monster {
                                                                                                                                                                                                                                                                                        
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.monsterindia.com/");
		
		WebElement job_search=driver.findElement(By.cssSelector("a[data-check='menutab']"));
		Actions action=new Actions(driver);
		action.moveToElement(job_search).build().perform();
		Thread.sleep(2000);
		
		WebElement job_skills=driver.findElement(By.xpath("//a[contains(text(),'Jobs by Skills')][1]"));
		Actions action1=new Actions(driver);
		action.moveToElement(job_skills).build().perform();
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Java Jobs')]"))).click().build().perform();
		driver.close();
	}

}
