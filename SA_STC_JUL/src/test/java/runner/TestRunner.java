package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// http://cucumber.github.io/api/cucumber/jvm/javadoc/cucumber/api/junit/package-summary.html
// https://cucumber.io/docs/reference/jvm#installation

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", 
		glue = { "stepDefinition" },
		plugin = {"html:target/cucumber-html-report", "pretty", "json:target/cucumber.json" }
		)

public class TestRunner {

}