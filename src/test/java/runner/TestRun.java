package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:Features/Healthcheck.feature",
		glue= {"stepdefination"},
		dryRun=false,
		plugin= {"pretty","html:target/HtmlReports"},
		monochrome=true
		)
public class TestRun {

}
