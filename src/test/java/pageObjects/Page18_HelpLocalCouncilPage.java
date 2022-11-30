package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Page18_HelpLocalCouncilPage {
	public WebDriver ldriver;
	
	public Page18_HelpLocalCouncilPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
