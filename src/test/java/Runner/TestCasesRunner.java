package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\main\\resources\\Features",
        glue = {"StepDefinitions"},
        plugin = {"pretty","html:target/TesReport.html"}
        //tags = "@Smoke"




)

public class TestCasesRunner extends AbstractTestNGCucumberTests {

}
