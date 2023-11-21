package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (id="checkout")
	WebElement CheckOutButton;
    @FindBy (id="continue-shopping")
    WebElement ContinueShoppingButton;
    
    
	public void Checkout_Button() {
    	CheckOutButton.click();
    }
    public void ContinueShopping_Button() {
    	ContinueShoppingButton.click();
    }

}
