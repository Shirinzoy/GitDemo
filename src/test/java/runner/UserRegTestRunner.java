package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "classpath:features//registration.feature",
glue = {"stepDefinitions"},
tags = "",
// in the Maven Project Notes learn more about Tags
// try know when you can use AND and OR, @All, (~) not/avoid
dryRun = false,
//strict = true,
monochrome = true,
plugin = {
		"pretty",
		"json:target/MyReports/report.json",
		"junit:target/MyReports/report.xml"
},
publish = true
)
public class UserRegTestRunner {

}
