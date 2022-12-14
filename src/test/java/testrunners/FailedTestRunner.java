package testrunners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"@target/rerun.txt"},
		glue = {"stepdefinitions", "hooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/","rerun:target/rerun.txt"
				}
	
		
		)
public class FailedTestRunner {

}
