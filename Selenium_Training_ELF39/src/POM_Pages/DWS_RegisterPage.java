package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Base_Test;
import Framework_Utility.Utility_Methods;

public class DWS_RegisterPage extends Utility_Methods{

	//constructor
		public DWS_RegisterPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}

		//web elements
		@FindBy(xpath="//a[@href='/register']")
		WebElement register_link;
		
		@FindBy(id="gender-female")
		WebElement gender;
		
		@FindBy(id="FirstName")
		WebElement firstname;
		
		@FindBy(id="LastName")
		WebElement lastname;
		
		@FindBy(id="Email")
		WebElement email;
		
		@FindBy(id="Password")
		WebElement pwd;
		
		@FindBy(id="ConfirmPassword")
		WebElement confirmpwd;
		
		@FindBy(xpath="(//input[@type='submit'])[2]")
		WebElement register_button;

		
		
		//methods
		public void Click_Gender() {
			//gender.click();
			Click_Gender();
		}
		
		public void Enter_FirstName(String value) {
			//firstname.sendKeys(value);
			Enter_Value_In_Edit_Field(firstname, value);
		}
		
		public void Enter_LaststName(String value) {
			//lastname.sendKeys(value);
			Enter_Value_In_Edit_Field(lastname, value);
		}
		
		public void Enter_Email(String value) {
			//email.sendKeys(value);
			Enter_Value_In_Edit_Field(email, value);
		}
		
		public void Enter_Password(String value) {
			//confirmpwd.sendKeys(value);
			Enter_Value_In_Edit_Field(pwd, value);
		}
		
		public void Enter_ConfirmPassword(String value) {
			//pwd.sendKeys(value);
			Enter_Value_In_Edit_Field(confirmpwd, value);
		}
		
		public void Register_Button() {
			//register_button.click();
			Click_Element(register_button);
		}
}
