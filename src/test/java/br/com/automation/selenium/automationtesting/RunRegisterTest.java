package br.com.automation.selenium.automationtesting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-register.json", "html:target/cucumber-register"})
public class RunRegisterTest {
}
