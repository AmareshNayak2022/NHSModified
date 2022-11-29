package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
              (
            	features=".//Features/countryNorthernIrelandNHS.feature",
            	glue="stepDefinitions",
            	dryRun = false,
            	monochrome = true,
            	plugin = {"pretty" ,
            			  "html:target/test-output.html"}
            		  
            		  
            		  
            		  
               )

public class TestRunner {

}
