package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalNHSHelpPage {
	
	public WebDriver ldriver;
	
	public FinalNHSHelpPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	
	@FindBy(xpath="//h1[@id='result-heading']")
	static WebElement mainHelpText;
	
	@FindBy(xpath="//h1[@id='result-reason']")
	static WebElement resultReason;
	
	
	public static String mainHelpTextshow() {
		String result = mainHelpText.getText();
		return result;
		
	}
	
	public static void resultReasonshow() {
		System.out.println(resultReason.getText());
		
	}

}
