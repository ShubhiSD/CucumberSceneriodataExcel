package Qapractice.CucumberAdvance;
import stepDef.StepDefinitions;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "Feature",
        glue = {"stepDef"},
        tags = {"~@Ignore"},
               format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class calTest extends AbstractTestNGCucumberTests{
	private TestNGCucumberRunner testNGCucumberRunner;
	@BeforeClass
	  public void setUpTest () {
		 testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	@DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass
    public void tearDowgfhnClass() throws Exception {
        testNGCucumberRunner.finish();
    }
  @Test(description = "Add and multiply two numbers <num1> & <num2>", dataProvider = "features",priority=1)
  public void addNumber(CucumberFeatureWrapper cucumberFeature) {
      testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
  }

}
