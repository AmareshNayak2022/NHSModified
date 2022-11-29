package stepDefinitions;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.CountryLivingSelectionPage;
import pageObjects.FinalNHSHelpPage;
import pageObjects.StartPage;
import utilities.AcceptCookies;
import utilities.WaitHelper;

public class BaseClass {
	
	public WebDriver driver;
	public StartPage sp;
	public CountryLivingSelectionPage cls;
	public FinalNHSHelpPage fh;
	public WaitHelper wait;
	public AcceptCookies ac;
	public static Logger logger; 
	public Properties configProp;
	
	
	
}
