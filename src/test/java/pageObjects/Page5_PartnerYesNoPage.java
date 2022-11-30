package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5_PartnerYesNoPage {
public WebDriver ldriver;
	
	public Page5_PartnerYesNoPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='radio-yes']")
	static WebElement partnerYes;
	@FindBy(xpath="//input[@id='radio-no']")
	static WebElement partnerNo;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void partnerYes() {
		partnerYes.click();
		
	}
	public static void partnerNo() {
		partnerNo.click();
		
	}
	public static void clickNext() {
		clickNext.click();
		
	}

}
