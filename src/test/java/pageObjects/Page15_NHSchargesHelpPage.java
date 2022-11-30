package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Page15_NHSchargesHelpPage{
	public WebDriver ldriver;
	
	public Page15_NHSchargesHelpPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
