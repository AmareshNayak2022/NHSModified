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
	
	@And("close Browserafter")
	public void close_browser() {
		driver.close();
	    
	}

}
