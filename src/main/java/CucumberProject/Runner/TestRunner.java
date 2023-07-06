package CucumberProject.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Cucumber1",  //This is to connect feature files with runner class
        //We need to copy path from content root
        glue = "CucumberProject/StepDefinetions", //This is to connect steps with runner class
        //We need to copy path from source root
        tags= "@smoke",
        dryRun = false,
        plugin = {
                "pretty",
                "rerun:target/rerun.txt",
                //we can run them from FailedRunner class.
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json"
        }
)



public class TestRunner {

}
