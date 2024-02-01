package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="src/test/resources/features",
		glue={"stepdefinitions","hooks"},
		publish=true,
		plugin = {
				"pretty",
				"html:target/CucumberReports/report.html",
				"json:target/CucumberReports/report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			},
//		plugin={
//				"pretty",
//				"html:target/CucumberReports/report.html",
//				"json:target/CucumberReports/report.json"
//			},
//		tags = "@important or @regression"
		tags = "@regression"
//		tags = ""
	)

public class TestRunner extends AbstractTestNGCucumberTests  {}
