

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class) // To import it add a junit jar
@CucumberOptions(features = "src/test/resources/HooksDemo/Hooksdemo.feature", glue = {
		"RunnerLayer" })
//		tags = "@smoke",
//		tags = "@smoke and @regression")
// in first parameter will take the location of feature file and in second
// parameter for glue{} we write the current class of folder name.

public class HooksRunner {

}
