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
        tags= "@senario2",
        dryRun = false
)


public class RegrationTest {





}
