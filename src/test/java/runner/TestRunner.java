package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features ={".//Features/AddNewCustomer.feature" , ".//Features/Admin.feature" },
		glue ={"stepDefinitions", "hookes"},
		dryRun =false, 
		monochrome =true,
		publish = true
		)

public class TestRunner {

}
