package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/features/Swiggy.feature",
        glue="stepDefinitions",
        plugin= {"pretty", "html:target/cucumber-reports.html"},
      tags = "@signin",
        monochrome=true
        )
public class TestRunner  {


}
