package bdd;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features",
    glue = "stepdef",
    dryRun = false,
    plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    tags = "@smoke"
)
public class TestRunner {
}
