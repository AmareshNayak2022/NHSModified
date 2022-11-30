package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Page3_DentalPracticeCountryPage {
	
public WebDriver ldriver;
	
	public Page3_DentalPracticeCountryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='radio-england']")
	static WebElement selectEngland;
	@FindBy(xpath="//input[@id='radio-scotland']")
	static WebElement selectScotland;
	@FindBy(xpath="//input[@id='radio-wales']")
	static WebElement selectWales;
	@FindBy(xpath="//input[@id='radio-ni']")
	static WebElement selectNorthernIreland;
	@FindBy(xpath="//input[@id='radio-not-registered']")
	static WebElement clicknotRegistered;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void selectEnglandcountry() {
		selectEngland.click();
		
	}
	public static void selectScotlandcountry() {
		selectScotland.click();
		
	}
	public static void selectWalescountry() {
		selectWales.click();
		
	}
	public static void selectNorthernIrelandcountry() {
		selectNorthernIreland.click();
		
	}
	public static void clickNotRegistered() {
		clicknotRegistered.click();
		
	}
	public static void clickNextbutton() {
		clickNext.click();
		
	}

}
