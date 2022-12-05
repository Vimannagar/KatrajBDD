package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"src\\test\\java\\applicationtest\\DataDriven.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"}
		
		
		
		)


public class DDTRunner {

}
