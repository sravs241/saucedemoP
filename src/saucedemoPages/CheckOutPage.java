package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	WebDriver driver;
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath="//button[text()='Finish']")
	WebElement finish;
	@FindBy (name="cancel")
	WebElement cancel;
	
	
	public void Finish_Button() {
		finish.click();
	}
	public void Cancel_Button() {
		cancel.click();
	}
}
