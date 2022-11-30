package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Page16_GlaucomaSelectionPage {
	public WebDriver ldriver;
	
	public Page16_GlaucomaSelectionPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
