package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.AcceptCookies;
import utilities.WaitHelper;

public class StepsEngland extends BaseClass {
	
/*	@Before
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
	}*/
	
	@Given("User launches browser and enters urlengland")
	public void user_launches_browser_and_enters_urlengland() throws InterruptedException {
		sp = new pageObjects.StartPage(driver);
	    wait = new WaitHelper(driver);
	    ac = new AcceptCookies(driver);
       
	   
	}

	@When("user clicks on StartNow buttonengland")
	public void user_clicks_on_start_now_buttonengland() throws InterruptedException {
		
		sp.clickStartNowbutton();
	    System.out.println("User landed country selection page");
	    Thread.sleep(9000);
	    ac.AcceptCookiesinthepage();
	    
	}
	
	@And("user selects country England clicks Next")
	public void user_select_country_England() throws InterruptedException {
		System.out.println("Select Country England");
	 
	    
	}
	@And("user selects GPPractice yes clicks Next")
	public void user_selects_GPPracticeCountry_Yes() throws InterruptedException {
		System.out.println("GPPractice Yes");
	   
	    
	}
	@And("user selects dental practice country England clicks Next")
	public void user_selects_DentalPractice_country_Yes() throws InterruptedException {
		System.out.println("Dental Practice Yes");
	    
	    
	}
	/*@And("user enter Date of Birth clicks Next")
	public void user_enters_DOB() throws InterruptedException {
	    dob = new Page4_DOBEntryPage(driver);
	    dob.enterDay();
	    dob.enterMonth();
	    dob.enterYear();
	    dob.clickNext();
	    Thread.sleep(5000);
	    
	}*/
	@When("user enter valid {string} and {string} and  {string} in Date of Birth clicks Next")
	public void user_enter_valid_and_and_in_date_of_birth_clicks_next(String Day, String Month	, String Year) throws InterruptedException {
		System.out.println("DOB entered");
	   
	   
	}
	@And("user enters livein partner Yes and clicks Next")
	public void user_selects_liveinpartner_yes() throws InterruptedException {
		System.out.println("Partner Yes");
	    
	    
	}
	@And("user selects benefits Yes and Clicks Next")
	public void user_selects_benefits_yes() throws InterruptedException {
		System.out.println("benefits Yes");
	   
	    
	}
	@And("user selects universal credit Yes and clicks Next")
	public void user_selects_universalcredit_yes() throws InterruptedException {
		System.out.println("universal credit Yes");
	   
	    
	}
	@And("user selects response and clicks Next")
	public void user_selects_response_yes() throws InterruptedException {
		System.out.println("Response Yes");
	   
	    
	}
	@And("user selects less than 935 pond and clicks Next")
	public void user_selects_lessThanPound_yes() throws InterruptedException {
		System.out.println("less than Pound Yes");

	    
	}
	
	

	@Then("user lands on NHSBSA help Page")
	public void user_lands_on_NHSBSA_help_Page() throws InterruptedException {
		System.out.println("Landed");
	    
	    
	    
	}

}
