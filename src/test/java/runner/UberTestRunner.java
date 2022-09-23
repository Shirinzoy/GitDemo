package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "classpath:features//UberDemo2.feature",
glue = {"stepDefinitions", "myHooks"},
tags = "@Regression or @Smoke or @Prod",
// in the Maven Project Notes learn more about Tags
// try know when you can use AND and OR, @All, (~) not/avoid
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
public class UberTestRunner {

}
