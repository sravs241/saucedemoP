package saucedemoPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class LoginPage extends BaseClass {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

		
	@FindBy (name="user-name")
	WebElement username;
	@FindBy (name="password")
	WebElement password;
	@FindBy (name="login-button")
	WebElement login;
	@FindBy (xpath="//button[@class='error-button']")
	WebElement errorbutton;
	public void Login_Data(String user,String pwd)
	{
		username.sendKeys(user);
		password.sendKeys(pwd);
		login.click();
	}
	
	public void Login()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	}
	public void Error() {
		errorbutton.click();
	}
	
}
