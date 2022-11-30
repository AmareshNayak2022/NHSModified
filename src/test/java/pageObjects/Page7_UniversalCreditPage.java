package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Page7_UniversalCreditPage {
public WebDriver ldriver;
	
	public Page7_UniversalCreditPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='yes-universal']")
	static WebElement yesUniversal;
	@FindBy(xpath="//input[@id='not-yet']")
	static WebElement notYet;
	@FindBy(xpath="//input[@id='different-benefit']")
	static WebElement differentBenefit;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void yesUniversal() {
		yesUniversal.click();
		
	}
	public static void notYet() {
		notYet.click();
		
	}
	public static void differentBenefit() {
		differentBenefit.click();
		
	}
	public static void clickNext() {
		clickNext.click();
		
	}

}
