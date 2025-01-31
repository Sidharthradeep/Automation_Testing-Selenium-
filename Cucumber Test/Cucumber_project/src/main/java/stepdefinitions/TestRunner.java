package stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags=" ",features="src/test/resources/Features/login1.feature",glue="stepdefinitions",plugin= {})

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
