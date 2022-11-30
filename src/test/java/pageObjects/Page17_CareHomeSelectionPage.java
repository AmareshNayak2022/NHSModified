package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Page17_CareHomeSelectionPage{
	public WebDriver ldriver;
	
	public Page17_CareHomeSelectionPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
