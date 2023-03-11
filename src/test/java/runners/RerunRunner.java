package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//SampleScenario.feature",
		glue = {"stepDefs"},
		monochrome = true,
		plugin = {"pretty"},
//				"html:target//Reports//HTMLReports.html",
//				"json:target//Reports//JsonReports.json",
//				"usage:target//Reports//UsageReports",
				//"rerun:target//failedScenarios.txt"},
		tags = "@SmokeTest",
		//tags = "@RegressionTest",
		//tags = "@SmokeTest or @RegressionTest",
		dryRun = false
		)

public class RerunRunner extends AbstractTestNGCucumberTests {
	
}
