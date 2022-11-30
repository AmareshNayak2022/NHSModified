package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CountryLivingSelectionPage;
import pageObjects.FinalNHSHelpPage;
import pageObjects.StartPage;
import utilities.AcceptCookies;
import utilities.WaitHelper;

public class BaseClass {
	

	
	public static WebDriver driver;
	public StartPage sp;
	public CountryLivingSelectionPage cls;
	public FinalNHSHelpPage fh;
	public WaitHelper wait;
	public AcceptCookies ac;
	public static Logger logger; 
	public Properties configProp;
	
	
	
}
