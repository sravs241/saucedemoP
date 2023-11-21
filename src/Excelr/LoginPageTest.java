package Excelr;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import saucedemoPages.LoginPage;
import saucedemoPages.ProductsPage;
import utils.BaseClass;
import utils.ExcelUtils;

public class LoginPageTest extends BaseClass  {
	@BeforeMethod
	public void launchurl() {
		LaunchingURL openurl=new LaunchingURL();
		openurl.launchbrowser();
	}
	@Test(dataProvider = "Logindata")
	public void LoginTest(String user, String pwd, String exp)  throws  InterruptedException
	{
		LoginPage login=new LoginPage(driver);
		login.Login_Data(user,pwd);	
		ProductsPage product=new ProductsPage(driver);
		Thread.sleep(2000);
		String exp_title="Products";
		String act_title=driver.getTitle();
		//
		if(exp.equals("Valid"))
		{
			if(exp_title.equals(act_title))
			{
				product.logout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("Invalid"))
		{
			if(exp_title.equals(act_title))
			{
				product.logout();
				Assert.assertTrue(false);
				
			}
			else
			{
				login.Error();
				Assert.assertTrue(true);
			}
		}
		
		
	}
	@DataProvider(name = "Logindata")

	public String[][] getData() throws IOException {
		//get the data from Excel
		
		String path=".\\file\\Login.xlsx";
		ExcelUtils xlutil=new ExcelUtils(path);
			
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);
		
		String LoginData[][]=new String[totalrows][totalcols];
		for(int i=1; i<=totalrows;i++)
		{
			for(int j=0; j<totalcols;j++)
			{
				LoginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
				
			}
		}
		return LoginData;

	}
	
}



