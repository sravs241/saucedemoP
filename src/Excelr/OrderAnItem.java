package Excelr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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
import utils.BaseClass;

public class OrderAnItem extends BaseClass  {
	
	@BeforeMethod
	public void launchurl() {
		LaunchingURL openurl=new LaunchingURL();
		openurl.launchbrowser();
	}
			
	@Test
		public void OrderByAddtoCart() throws InterruptedException {
		//Order by Add to Cart

		LoginPage login=new LoginPage(driver);
		login.Login();
		Thread.sleep(2000);
		ProductsPage product=new ProductsPage(driver);
		product.AddToCartBLProduct();
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
		CheckOutPage finish=new CheckOutPage(driver);
		finish.Finish_Button();
		CheckOutCompletePage order=new CheckOutCompletePage(driver);
		order.ThankYouMessage();
		order.CompleteText();
		Thread.sleep(2000);
		order.BackHome_Button();
			
	}
	
	
	
	
	
}
