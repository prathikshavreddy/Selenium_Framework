package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Base_Test;

public class DWS_LoginPage extends Base_Test{
		
	//constructor
	public DWS_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//web elements
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement login_button;
	
	//methods
	public void Enter_Username(String value) {
		username.sendKeys(value);
	}
	
	public void Enter_Password(String value) {
		pwd.sendKeys(value);
	}
	
	public void Click_Login() {
		login_button.click();
	}
}
