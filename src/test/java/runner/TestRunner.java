package runner;
// Step11: in this class we dont need to write any implementations, but writing two annotations.

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "classpath:features//Search.feature",
glue = {"stepDefinitions","myHooks"},
tags = "",
dryRun = true,
strict = true,
monochrome = true,
plugin = {
		"pretty",
		"html:target/site/cucumber-pretty",
		"json:target/cucumber.json"
},
publish = true
)

public class TestRunner {

}
