package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Page13_DiabetesSelectionPage {
	
	public WebDriver ldriver;
	
	public Page13_DiabetesSelectionPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
