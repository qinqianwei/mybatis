package test.java.stepdefinition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/findId.feature"

,glue= {"test.java.stepdefinition"},monochrome=true)

public class findIdTest {

}
