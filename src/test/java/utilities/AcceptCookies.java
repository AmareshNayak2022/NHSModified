package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinitions.BaseClass;

public class AcceptCookies extends BaseClass {
	
public WebDriver driver;
	
	public AcceptCookies(WebDriver driver) {
		this.driver = driver;
	}
	
	public void AcceptCookiesinthepage() {
		driver.findElement(By.xpath("//button[@id='nhsuk-cookie-banner__link_accept_analytics']")).click();
		
	}

}
