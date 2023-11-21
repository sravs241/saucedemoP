package Excelr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import saucedemoPages.BackPackPage;
import saucedemoPages.BoltTShirtPage;
import saucedemoPages.CartPage;
import saucedemoPages.CheckOutCompletePage;
import saucedemoPages.CheckOutInformationPage;
import saucedemoPages.CheckOutPage;
import saucedemoPages.LoginPage;
import saucedemoPages.ProductsPage;
import saucedemoPages.TShirtRedPage;
import utils.BaseClass;

public class Order_byClickingProductName extends BaseClass {

	@BeforeMethod
	public void launchurl() {
		LaunchingURL openurl=new LaunchingURL();
		openurl.launchbrowser();
	}
		
	
	@Test 
	public void OrderByAddtoCart() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.Login();
		ProductsPage product=new ProductsPage(driver);
		product.BpotTShirtProduct();;
		BoltTShirtPage backpack=new BoltTShirtPage(driver);
		Thread.sleep(2000);
		backpack.AddToCart();
		product.cartButton();
		Thread.sleep(2000);
		CartPage cart=new CartPage(driver);
		cart.Checkout_Button();
		CheckOutInformationPage info=new CheckOutInformationPage(driver);
		info.FirstName();
		info.LastName();
		info.PostalCode();
		Thread.sleep(2000);
		info.Continue_Button();
		Thread.sleep(2000);
		CheckOutPage finish=new CheckOutPage(driver);
		finish.Finish_Button();
		CheckOutCompletePage order=new CheckOutCompletePage(driver);
		order.ThankYouMessage();
		order.CompleteText();
			
	}
	
	
}
