package StepDef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(
features= {"Features/Test.feature"},	
glue= {},
plugin= {"pretty","html:target/Cucumber_Report"}
//monochrome=true
////tags= {"@TC01"}
)


public class Runner {

	
	
	
}
