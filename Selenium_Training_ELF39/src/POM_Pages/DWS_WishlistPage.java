package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_WishlistPage extends Utility_Methods{
	
	public DWS_WishlistPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

	@FindBy(linkText = "Wishlist")
	WebElement click_wishlist;
	
	public void Click_Wishlist() {
		click_wishlist.click();
	}
	
}