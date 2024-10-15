package TestCaseLayer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // To import it add a junit jar
@CucumberOptions(features = "src/test/resources/HooksDemo/Hook.feature", glue = {
		"Hooks" }, monochrome = true, 
				plugin = {	"pretty","html:target/HtmlReports",
				"junit:target/JunitReport/repoprt.xml",
				"json:target/JSONReport/repoprt.json"})
// in first parameter will take the location of feature file and in second
// parameter for glue{} we write the current class of folder name.

public class HooksRunner {

}
