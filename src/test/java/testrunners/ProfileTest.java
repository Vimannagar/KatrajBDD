package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = {"src\\test\\java\\applicationtest\\tags.feature"},
		
		glue = {"steps"},
		
		tags = "@Smoke",
		
		plugin = {"pretty"}
		
		
		
		)


public class ProfileTest {

}
