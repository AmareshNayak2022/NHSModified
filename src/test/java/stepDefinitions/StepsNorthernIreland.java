package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.CountryLivingSelectionPage;
import pageObjects.FinalNHSHelpPage;
import pageObjects.StartPage;
import utilities.AcceptCookies;
import utilities.WaitHelper;

public class StepsNorthernIreland extends BaseClass {
	
	@Before
	public void setup() throws IOException {
		
		logger = Logger.getLogger("NHSBSACucumberBDDFinal");
		PropertyConfigurator.configure("log4j.properties");
		
		configProp = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		
		
		String Browser = configProp.getProperty("browser");
		if(Browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		logger.info("*****Launching Browser****");
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		logger.info("*****Launching URL****");
		driver.manage().window().maximize();
	}
		
	@Given("user is on the startpage")
	public void user_onStartPage() {	
	    sp = new StartPage(driver);
	    wait = new WaitHelper(driver);
	    ac = new AcceptCookies(driver);
	    
	    
	}

	@When("user clicks on StartNow")
	public void user_clicks_on_start_now() {
		sp.clickStartNowbutton();
		wait.implicitwait();
		ac.AcceptCookiesinthepage();
		
	   
	}

	@When("user selects country NorthernIreland")
	public void user_selects_country_northern_ireland() {
		cls = new CountryLivingSelectionPage(driver);
		cls.selectNorthernIrelandcountry();
		wait.implicitwait();
	   
	}

	@When("user clicks Next button")
	public void user_clicks_next_button() {
		cls.clickNextbutton();
		wait.implicitwait();
	
	}

	@SuppressWarnings("deprecation")
	@Then("user checks the treatment helpnorthernireland")
	public void user_checks_the_treatment_helpnorthernireland() {
		fh = new FinalNHSHelpPage(driver);
		String ExpectedResult = fh.mainHelpTextshow();
		Assert.assertEquals(ExpectedResult, "You cannot use this service because you live in Northern Ireland");
		wait.implicitwait();
	}

	@And("close Browser")
	public void close_browser() {
		driver.close();
	    
	}
	
	
//------------------2nd scenario---------------
	


	@When("user selects country NorthernIreland2")
	public void user_selects_country_northern_ireland2() {
		cls = new CountryLivingSelectionPage(driver);
		cls.selectNorthernIrelandcountry();
		wait.implicitwait();
	   
	}

	@When("user clicks Next button2")
	public void user_clicks_next_button2() {
		cls.clickNextbutton();
		wait.implicitwait();
	
	}

	@SuppressWarnings("deprecation")
	@Then("user checks the other treatment helpnorthernireland2")
	public void user_checks_the_other_treatment_helpnorthernireland2() {
		fh = new FinalNHSHelpPage(driver);
		String ExpectedResult = fh.mainHelpTextshow();
		Assert.assertEquals(ExpectedResult, "You cannot use this service because you live in Northern Ireland");
		wait.implicitwait();
	}

	@And("close Browser2")
	public void close_browser2() {
		driver.close();
	    
	}
	

}
