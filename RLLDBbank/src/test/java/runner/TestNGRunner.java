package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\KIIT\\eclipse-workspace\\RLLDBbank\\src\\test\\java\\feature", glue = { "stepdef","pages" }, plugin = {
		"html:target/Cucumberreport.html", "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/" },monochrome =true
)
public class TestNGRunner extends io.cucumber.testng.AbstractTestNGCucumberTests{

	
}
