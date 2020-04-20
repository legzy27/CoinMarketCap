package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resource/coinmarket.feature"},
        glue= "stepdefs",
        tags = {"~@smoketests"}
)
public class RunCukesTest {



}
