package utilities;

import java.time.Duration;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinitions.BaseClass;

public class WaitHelper extends BaseClass {
	
	public WebDriver driver;
	
	public WaitHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public void WaitForElement(WebElement element, Duration timeOutinSeconds) {
		WebDriverWait wait = new WebDriverWait(driver,timeOutinSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	}
	

}
