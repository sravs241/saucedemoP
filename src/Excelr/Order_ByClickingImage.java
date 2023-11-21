package Excelr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import saucedemoPages.BackPackPage;
import saucedemoPages.CartPage;
import saucedemoPages.CheckOutCompletePage;
import saucedemoPages.CheckOutInformationPage;
import saucedemoPages.CheckOutPage;
import saucedemoPages.LoginPage;
import saucedemoPages.ProductsPage;
import utils.BaseClass;

public class Order_ByClickingImage extends BaseClass{
	@BeforeMethod
	public void launchurl() {
		LaunchingURL openurl=new LaunchingURL();
		openurl.launchbrowser();
	}
	@Test 
	public void OrderByAddtoCart() {
		LoginPage login=new LoginPage(driver);
		login.Login();
		ProductsPage product=new ProductsPage(driver);
		product.ImageBPProduct();
		BackPackPage backpack=new BackPackPage(driver);
		backpack.AddToCart();
		product.cartButton();
		CartPage cart=new CartPage(driver);
		cart.Checkout_Button();
		CheckOutInformationPage info=new CheckOutInformationPage(driver);
		info.FirstName();
		info.LastName();
		info.PostalCode();
		info.Continue_Button();
		CheckOutPage finish=new CheckOutPage(driver);
		finish.Finish_Button();
		CheckOutCompletePage order=new CheckOutCompletePage(driver);
		order.ThankYouMessage();
		order.CompleteText();
			
	}
	
}
