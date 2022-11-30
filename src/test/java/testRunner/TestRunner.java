package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
              (
            	features=".//Features/countryEnglandNHS.feature",
            	glue="stepDefinitions",
            	dryRun = false,
            	monochrome = true,
            	plugin = {"pretty" ,
            			  "html:target/test-output.html"}
            	//tags="@runthat"          		  
            		  
               )

public class TestRunner {

}
