package runnerfile;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import stepDefinition.CHhomepage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/FeatureFile", glue="src/stepDefinition")

public class Testrunner {
CHhomepage obj = new CHhomepage();
}
