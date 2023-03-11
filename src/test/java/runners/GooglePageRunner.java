package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//features//GooglePageSearch.feature",
		glue = {"stepDefs"},
		monochrome = true,
		plugin = {"pretty",
				"html:target//Reports//HTMLReports.html"},
//				"json:target//Reports//JsonReports.json",
//				"usage:target//Reports//UsageReports",
//				"rerun:target//failedScenarios.txt"},
		//tags =  "@SmokeTest and @RegressionTest",
		//tags = "not @SmokeTest",
		//tags = "@PhaseOne and @SmokeTest",
		//tags = "@PhaseTwo and @RegressionTest",
		dryRun = false
		)

public class GooglePageRunner extends AbstractTestNGCucumberTests{
	
}
