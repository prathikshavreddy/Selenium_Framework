package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_ShoppingCartPage extends Utility_Methods{

		public DWS_ShoppingCartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(className = "cart-label")
		WebElement shopping_cart;
		
		public void Click_ShoppingCart() {
			shopping_cart.click();
		}
}
