package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;


public class DWS_NewsletterSubscribePage extends Utility_Methods{
		
		public DWS_NewsletterSubscribePage(WebDriver driver) {
			
			PageFactory.initElements(driver,this);
			
		}
			
			//WebElements
			@FindBy(xpath="(//input[@id=\"newsletter-email\"])[1]")
			
			WebElement newsletter;
			
			@FindBy(xpath="(//input[@type=\'button\'])[1]")
			
			WebElement subscribe;
			
		//Methods
			
			public void enter_subscribe_field(String value) {
				
				Enter_Value_In_Edit_Field(newsletter, value);
			}
			
			public void click_subscribe() {
				
				Click_Element(subscribe);
			}

}
