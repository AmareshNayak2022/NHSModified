package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Page14_MedicationDiabetesPage{
	public WebDriver ldriver;
	
	public Page14_MedicationDiabetesPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

}
