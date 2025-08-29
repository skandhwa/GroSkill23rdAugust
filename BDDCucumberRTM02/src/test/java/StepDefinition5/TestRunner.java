package StepDefinition5;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="src/test/java/FeatureFiles/",
		glue= {"StepDefinition5"},
		tags="@test1",
		dryRun=false,
		monochrome=false,
	plugin= {"pretty","html:target/HtmlReports/index.html"
			,"json:target/CucumberReports/cucumber.json"}
		
		
				
		
		
		
		)



















public class TestRunner {

}
