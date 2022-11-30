package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Page6_BenefitsTaxCreditsYesNoPage {
	
public WebDriver ldriver;
	
	public Page6_BenefitsTaxCreditsYesNoPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='radio-yes']")
	static WebElement benefitYes;
	@FindBy(xpath="//input[@id='radio-no']")
	static WebElement benefitNo;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void partnerYes() {
		benefitYes.click();
		
	}
	public static void partnerNo() {
		benefitNo.click();
		
	}
	public static void clickNext() {
		clickNext.click();
		
	}

}
