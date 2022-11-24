package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework_Utility.Utility_Methods;

public class DWS_BooksPage extends Utility_Methods{
	
	public DWS_BooksPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//a[@href=\'/books\'])[1]")
	WebElement books;
	
	@FindBy(name="products-orderby")
	WebElement sortby;
	
	@FindBy(id="products-pagesize")
	WebElement display;
	
	@FindBy(id="products-viewmode")
	WebElement view_as;
	
	public void click_books() {
		books.click();
	}
	
	public void select_sortby(String value) {
		Select_By_Visible_Text(sortby, value);
	}
	
	public void select_display(int num) {
		Select_By_Index(display, num);
	}
	
	public void select_view_as(String value) {
		Select_By_Visible_Text(view_as, value);
	}
}
