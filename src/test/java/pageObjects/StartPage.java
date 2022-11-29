package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage {
	
	public WebDriver ldriver;
	
	public StartPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='next-button']")
	WebElement StartNowbutton;
	
	public void clickStartNowbutton() {
		StartNowbutton.click();
	}
	

}
