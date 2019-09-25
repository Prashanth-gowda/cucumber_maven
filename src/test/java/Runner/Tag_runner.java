package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features\\Tagdemo.feature", glue= {"Stepdef"} , tags= {"@SmokeTest"})
public class Tag_runner {

}
