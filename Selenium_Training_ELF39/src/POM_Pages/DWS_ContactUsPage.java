package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_ContactUsPage extends Utility_Methods{
	
	public DWS_ContactUsPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	
		@FindBy(xpath="//a[@href='/contactus']")
		WebElement contact_us;
		
		@FindBy(xpath="//input[@class='fullname']")
		WebElement name;
		
		@FindBy(xpath="//input[@class='email']")
		WebElement email;
		
		@FindBy(className = "button-1 contact-us-button")
		WebElement submit_button;
		
		@FindBy(xpath="//textarea[@class='enquiry']")
		WebElement enquiry;
		
		public void click_contact_us() {
			contact_us.click();
		}
		
		public void enter_name(String value) {
			Enter_Value_In_Edit_Field(name, value);
		}
		
		public void enter_email(String value) {
			Enter_Value_In_Edit_Field(email, value);
		}
		
		public void enter_enquiry(String value) {
			Enter_Value_In_Edit_Field(enquiry, value);
		}
		
		public void contact_us_button() {
			submit_button.click();
		}
}
