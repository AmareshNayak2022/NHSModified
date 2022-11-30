package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.CountryLivingSelectionPage;
import pageObjects.Page10_TakeHome935Page;
import pageObjects.Page2_GPPracticeLocationYesNoPage;
import pageObjects.Page3_DentalPracticeCountryPage;
import pageObjects.Page4_dobEntryPage;
import pageObjects.Page5_PartnerYesNoPage;
import pageObjects.Page6_BenefitsTaxCreditsYesNoPage;
import pageObjects.Page7_UniversalCreditPage;
import pageObjects.Page8_ResponsePage;
import utilities.AcceptCookies;
import utilities.WaitHelper;

public class StepsEngland extends BaseClass {
	
	
	
	@Given("user is on StartPage")
	public void user_is_on_startPage() throws InterruptedException {
		
		sp = new pageObjects.StartPage(driver);
	    wait = new WaitHelper(driver);
	    ac = new AcceptCookies(driver);
       
	   
	}

	@When("user clicks on StartNow buttonengland")
	public void user_clicks_on_start_now_buttonengland() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='next-button']")).click();
		//sp.clickStartNowbutton();
	    System.out.println("User landed country selection page");
	    Thread.sleep(9000);
	    ac.AcceptCookiesinthepage();
	    
	}
	
	@And("user selects country England clicks Next")
	public void user_select_country_England() throws InterruptedException {
		cls = new CountryLivingSelectionPage(driver);
		cls.selectEnglandcountry();
		cls.clickNextbutton();
	 
	    
	}
	@And("user selects GPPractice yes clicks Next")
	public void user_selects_GPPracticeCountry_Yes() throws InterruptedException {
		gp = new Page2_GPPracticeLocationYesNoPage(driver);
		gp.selectGPPracticeYes();
		gp.clickNextbutton();
	   
	    
	}
	@And("user selects dental practice country England clicks Next")
	public void user_selects_DentalPractice_country_Yes() throws InterruptedException {
		dp = new Page3_DentalPracticeCountryPage(driver);
		dp.selectEnglandcountry();
		dp.clickNextbutton();
	    
	    
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
		dob = new Page4_dobEntryPage(driver);
		dob.enterDay(Day);
		dob.enterMonth(Month);
		dob.enterYear(Year);
		dob.clickNext();
		
	   
	   
	   
	}
	@And("user enters livein partner Yes and clicks Next")
	public void user_selects_liveinpartner_yes() throws InterruptedException {
		pp = new Page5_PartnerYesNoPage(driver);
		pp.partnerYes();
		pp.clickNext();
	    
	    
	}
	@And("user selects benefits Yes and Clicks Next")
	public void user_selects_benefits_yes() throws InterruptedException {
		btc = new Page6_BenefitsTaxCreditsYesNoPage(driver);
		btc.partnerYes();
		btc.clickNext();
	   
	    
	}
	@And("user selects universal credit Yes and clicks Next")
	public void user_selects_universalcredit_yes() throws InterruptedException {
		ucp = new Page7_UniversalCreditPage(driver);
		ucp.yesUniversal();
		ucp.clickNext();
	   
	    
	}
	@And("user selects response and clicks Next")
	public void user_selects_response_yes() throws InterruptedException {
		rp = new Page8_ResponsePage(driver);
		rp.responseYes();
		rp.clickNext();
	   
	    
	}
	@And("user selects less than 935 pond and clicks Next")
	public void user_selects_lessThanPound_yes() throws InterruptedException {
		thp1 = new Page10_TakeHome935Page(driver);
		thp1.takeHome935Yes();
		thp1.clickNext();    
	}
	
	

	@Then("user lands on NHSBSA help Page")
	public void user_lands_on_NHSBSA_help_Page() throws InterruptedException {
		System.out.println("Landed");
	        
	    
	}
	
	@And("close Browserafter")
	public void close_browser() {
		driver.close();
	    
	}

}
