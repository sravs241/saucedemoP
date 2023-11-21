package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackPackPage {
WebDriver driver;
	
	public BackPackPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="add-to-cart-sauce-labs-backpack")
	WebElement Addtocart;
	@FindBy (id="remove-sauce-labs-backpack")
	WebElement remove;
	@FindBy (xpath="//a[@class='shopping_cart_link']")
	WebElement cart;
	
	public void AddToCart() {
		Addtocart.click();
	}
	public void Remove() {
		remove.click();
	}
	public void Cart() {
		cart.click();
	}

}
