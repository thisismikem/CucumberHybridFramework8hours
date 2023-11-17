package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				 glue={"stepdefinitions","hooks"},
				 publish=true,
				 plugin={
						 "pretty",
						 "html:target/CucumberReports/report.html",
						 "json:target/CucumberReports/report.json"
						}//,
				// tags = "@important or @regression"
				)

public class TestRunner {}
