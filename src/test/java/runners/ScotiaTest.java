package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//strict = true,
		features = {"C:\\Users\\Krunal\\eclipse-workspace\\CucumberProject2\\src\\test\\java\\features"},//the path of the feature files
		glue={"stepDefinations"}//the path of the step definition files
		//plugin= {"pretty"},
		//monochrome = true, //display the console output in a proper readable format
		 //it will check if any step is not defined in step definition file
		//dryRun = false //to check the mapping is proper between feature file and step def file
		)
public class ScotiaTest {

}
