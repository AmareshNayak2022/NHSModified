package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Page19_Savings23250Page {
	public WebDriver ldriver;
	
	public Page19_Savings23250Page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
