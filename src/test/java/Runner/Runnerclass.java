package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ="Featurefile/Opengoogle.feature" ,glue ="stepDefinitions")
public class Runnerclass {

	

}
