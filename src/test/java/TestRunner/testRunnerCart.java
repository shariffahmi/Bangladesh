package TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.TestBaseCart;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Feature" }, 
plugin = {"json:target/cucumber.json" },
glue = "StepDefination") // ,tags= "@S" )

public class testRunnerCart extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void setup2() {

		TestBaseCart test = new TestBaseCart();
		test.open();
	}

	@AfterTest
	public void close() {
		TestBaseCart test = new TestBaseCart();
		test.driver.quit();
		;

	}
}
