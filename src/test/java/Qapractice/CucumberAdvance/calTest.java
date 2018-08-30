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
import com.cucumber.listener.Reporter;
import Utility.ConfigFileReader;
@CucumberOptions(
        features = "Feature",
        glue = {"stepDef"},
              format= {
                "pretty",
                "html:target/cucumber-reports/htmlreport",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
       
        })

public class calTest extends AbstractTestNGCucumberTests{
	private TestNGCucumberRunner testNGCucumberRunner;
	ConfigFileReader configreader;
	@BeforeClass
	  public void setUpTest () {
		 testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		 configreader=new ConfigFileReader();
	}
	@DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass
    public void tearDowgfhnClass() throws Exception {
       testNGCucumberRunner.finish();
    	Reporter.loadXMLConfig(configreader.getReportConfigPath());
    	Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.7.0");
	    Reporter.setSystemInfo("Maven", "3.5.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
    }
 
  @Test(description = "Add and multiply two numbers <num1> & <num2>", dataProvider = "features",priority=1)
  public void addNumber(CucumberFeatureWrapper cucumberFeature) {
      testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
  }

}
