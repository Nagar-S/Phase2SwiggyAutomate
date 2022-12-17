package TestScript;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features="Feature//automate_swiggy.feature"
		,glue="TestScript"
		,tags="@Automate_Swiggy"
		//,dryRun=true
		)

public class TestRunner extends AbstractTestNGCucumberTests
{

}