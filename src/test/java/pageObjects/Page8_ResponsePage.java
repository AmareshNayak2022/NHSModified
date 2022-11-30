package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Page8_ResponsePage {
public WebDriver ldriver;
	
	public Page8_ResponsePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='radio-yes']")
	static WebElement responseYes;
	@FindBy(xpath="//input[@id='radio-no']")
	static WebElement reponseNo;
	@FindBy(xpath="//input[@id='next-button']")
	static WebElement clickNext;
	
	public static void responseYes() {
		responseYes.click();
		
	}
	public static void responseNo() {
		reponseNo.click();
		
	}
	public static void clickNext() {
		clickNext.click();
		
	}

}
