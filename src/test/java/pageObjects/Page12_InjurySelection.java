package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Page12_InjurySelection{
	public WebDriver ldriver;
	
	public Page12_InjurySelection(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
