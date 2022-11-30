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
import pageObjects.Page10_TakeHome935Page;
import pageObjects.Page11_PregnacySelectionPage;
import pageObjects.Page12_InjurySelection;
import pageObjects.Page13_DiabetesSelectionPage;
import pageObjects.Page14_MedicationDiabetesPage;
import pageObjects.Page15_NHSchargesHelpPage;
import pageObjects.Page16_GlaucomaSelectionPage;
import pageObjects.Page17_CareHomeSelectionPage;
import pageObjects.Page18_HelpLocalCouncilPage;
import pageObjects.Page19_Savings23250Page;
import pageObjects.Page20_Savings16000Page;
import pageObjects.Page2_GPPracticeLocationYesNoPage;
import pageObjects.Page3_DentalPracticeCountryPage;
import pageObjects.Page4_dobEntryPage;
import pageObjects.Page5_PartnerYesNoPage;
import pageObjects.Page6_BenefitsTaxCreditsYesNoPage;
import pageObjects.Page7_UniversalCreditPage;
import pageObjects.Page8_ResponsePage;
import pageObjects.Page9_Takehome435Page;
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
	public Page2_GPPracticeLocationYesNoPage gp;
	public Page3_DentalPracticeCountryPage dp;
	public Page4_dobEntryPage dob;
	public Page5_PartnerYesNoPage pp;
	public Page6_BenefitsTaxCreditsYesNoPage btc;
	public Page7_UniversalCreditPage ucp;
	public Page8_ResponsePage rp;
	public Page9_Takehome435Page thp;
	public Page10_TakeHome935Page thp1;
	public Page11_PregnacySelectionPage psp;
	public Page12_InjurySelection isp;
	public Page13_DiabetesSelectionPage dsp;
	public Page14_MedicationDiabetesPage mdp;
	public Page15_NHSchargesHelpPage chp;
	public Page16_GlaucomaSelectionPage gsp;
	public Page17_CareHomeSelectionPage chs;
	public Page18_HelpLocalCouncilPage hlc;
	public Page19_Savings23250Page sap;
	public Page20_Savings16000Page sap1;
	
	
	
	
	
}
