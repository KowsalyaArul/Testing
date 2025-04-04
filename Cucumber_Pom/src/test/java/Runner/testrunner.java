package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src//test//resource//Features"},
		    glue= {"stepdef4"},
			plugin= {"pretty","html:target/htmlreports/report.html"},
			tags="@set3"
)
public class testrunner extends AbstractTestNGCucumberTests{

}
