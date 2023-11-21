package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInformationPage {
WebDriver driver;
public CheckOutInformationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
	@FindBy(id = "first-name")
	WebElement firstname;
	@FindBy(id = "last-name")
	WebElement lastname;
	@FindBy(id = "postal-code")
	WebElement postalcode;
	@FindBy(id = "continue")
	WebElement Continue;
	@FindBy(name = "cancel")
	WebElement cancel;

	
	public void FirstName() {
		firstname.sendKeys("Test");
	}
	public void LastName() {
		lastname.sendKeys("Testing");
	}
	public void PostalCode() {
		postalcode.sendKeys("123456");
	}
	public void Continue_Button() {
		Continue.click();
	}
	public void Cancel_Button() {
		cancel.click();
	}

}
