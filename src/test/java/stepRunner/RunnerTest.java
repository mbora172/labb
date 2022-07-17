package stepRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "stepdef",
        tags = "@lab2",//@lab3
        plugin = {"pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
        "rerun:target/rerun.txt"}
)
public class RunnerTest {
}
