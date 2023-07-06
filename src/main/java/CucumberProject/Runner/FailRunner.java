package CucumberProject.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/rerun.txt",
        glue = "CucumberProject/StepDefinetions",
        dryRun = false,
        plugin = {
                "pretty",
                "rerun:target/rerun.txt"
        }
)



public class FailRunner {
}
