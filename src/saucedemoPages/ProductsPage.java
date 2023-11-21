package saucedemoPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement AddBackPackProduct;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	WebElement RemoveBackPackProduct;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement AddBikeLightProduct;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
	WebElement RemoveBikeLightProduct;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement AddBoltTShirtProduct;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
	WebElement RemoveBoltTShirtProduct;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	WebElement AddFleeceJacketProduct;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")
	WebElement RemoveFleeceJacketProduct;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	WebElement AddOnesieProduct;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
	WebElement RemoveOnesieProduct;
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	WebElement AddTshirtRedProduct;
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	WebElement RemoveTshirtRedProduct;
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement BackpackProduct;
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
	WebElement BikeLightProduct;
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	WebElement BoltTShirtProduct;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	WebElement FleeceJacketProduct;
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	WebElement OnesieProduct;
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	WebElement TShirtRedProduct;
	@FindBy(xpath = "//img[@alt='Sauce Labs Backpack']")
	WebElement BackPackImage;
	@FindBy(xpath = "//img[@alt='Sauce Labs Bike Light']")
	WebElement BkeLightImage;
	@FindBy(xpath = "//img[@alt='Sauce Labs Bolt T-Shirt']")
	WebElement BoltTShirtImage;
	@FindBy(xpath = "//img[@alt='Sauce Labs Fleece Jacket']")
	WebElement FleeceJacketImage;
	@FindBy(xpath = "//img[@alt='Sauce Labs Onesie']")
	WebElement OnesieImage;
	@FindBy(xpath = "//img[@alt='Test.allTheThings() T-Shirt (Red)']")
	WebElement TShirtRedImage;
	@FindBy(xpath = "//div[@id='shopping_cart_container']")
	WebElement CartButton;
	@FindBy(xpath = "//div[@id='menu_button_container']")
	WebElement OpenMenuButton;
	@FindBy (xpath="//span[text()='Products']")
	WebElement Products;
	@FindBy(xpath = "//a[text()='All Items']")
	WebElement AllItems;
	@FindBy(xpath = "//a[text()='//a[text()='About']']")
	WebElement About;
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;
	@FindBy(xpath = "//a[text()='Reset App State']")
	WebElement ResetAppState;
	public void AllItems() {
		AllItems.click();
	}
	
	public void About() {
		About.click();
	}
	public void LogOut() {
		Logout.click();
	}
	public void ResetAppState() {
		ResetAppState.click();
	}

	public void AddToCartBPProduct() {
		AddBackPackProduct.click();
	}

	public void AddToCartBLProduct() {
		AddBikeLightProduct.click();
	}

	public void AddToCartBTShirtProduct() {
		AddBoltTShirtProduct.click();
	}

	public void AddToCartFJProduct() {
		AddFleeceJacketProduct.click();
	}

	public void AddToCartOneSieProduct() {
		AddOnesieProduct.click();
	}

	public void AddToCartTShirtRedProduct() {
		AddTshirtRedProduct.click();
	}

	public void RemoveBPProduct() {
		RemoveBackPackProduct.click();
	}

	public void RemoveBLProduct() {
		RemoveBikeLightProduct.click();
	}

	public void RemoveBTShirtProduct() {
		RemoveBoltTShirtProduct.click();
	}

	public void RemoveFJProduct() {
		RemoveFleeceJacketProduct.click();
	}

	public void RemoveTSRedProduct() {
		RemoveTshirtRedProduct.click();
	}

	public void RemoveOSProduct() {
		RemoveOnesieProduct.click();
	}
	public void BPProduct() {
		BackPackImage.click();
	}

	public void BLProduct() {
		BikeLightProduct.click();
	}

	public void BpotTShirtProduct() {
		BoltTShirtProduct.click();
	}

	public void FJProduct() {
		FleeceJacketProduct.click();
	}

	public void TSRedProduct() {
		TShirtRedProduct.click();
	}

	public void OSProduct() {
		OnesieProduct.click();
	}
	public void ImageBPProduct() {
		BackPackImage.click();
	}

	public void ImageBLProduct() {
		BkeLightImage.click();
	}

	public void ImageBpotTShirtProduct() {
		BoltTShirtImage.click();
	}

	public void ImageFJProduct() {
		FleeceJacketImage.click();
	}

	public void ImageTSRedProduct() {
		TShirtRedImage.click();
	}

	public void ImageOSProduct() {
		OnesieProduct.click();
	}
public void cartButton()
{
	CartButton.click();
}
public void Product() {
	Products.isDisplayed();
}
	public void logout() {
		OpenMenuButton.click();
		Logout.click();
	}
	
}
