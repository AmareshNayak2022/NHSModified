package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Page9_Takehome435Page {
public WebDriver ldriver;
	
	public Page9_Takehome435Page(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
