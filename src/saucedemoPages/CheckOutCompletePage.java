package saucedemoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutCompletePage {
	WebDriver driver;
	public CheckOutCompletePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//button[text()='Back Home']")
	WebElement backhome;
	@FindBy (xpath="//div[@id='checkout_complete_container']/h2")
	WebElement thankyoumessage;
	@FindBy (xpath="//div[@class='complete-text']")
	WebElement completetext;
	
	public void BackHome_Button() {
		backhome.click();
	}
	public boolean ThankYouMessage() {
		return thankyoumessage.isDisplayed();
	}
	public boolean CompleteText() {
		return completetext.isDisplayed();
	}
}
