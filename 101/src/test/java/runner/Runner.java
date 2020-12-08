package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features="FeatureFiles/datatable.feature",glue="stepdefinition",
dryRun=false,
monochrome=true,
plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun-reports/rerun.txt"
})


public class Runner {
	
	//it should combine step definition and feature file 
	// we have to define the runner 

	

}
