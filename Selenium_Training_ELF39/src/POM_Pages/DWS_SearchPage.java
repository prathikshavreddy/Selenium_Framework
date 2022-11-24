package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_SearchPage extends Utility_Methods{
	
	public DWS_SearchPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id ="small-searchterms")
	WebElement click_search;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement search_button;
	
	public void Click_Search() {
		Click_Element(click_search);
	}

	public void Enter_Product_In_SearchField(String value) {
		Enter_Value_In_Edit_Field(click_search, value);
	}
	
	public void Search_Button() {
		Click_Element(search_button);
	}
	
}
