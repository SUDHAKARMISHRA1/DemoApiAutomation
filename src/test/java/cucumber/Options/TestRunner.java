package cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags = "", features = {".//src//test//java//features"},glue = {"stepDefinitions"},
plugin = {"json:target/jsonReports/cucumber-report.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
