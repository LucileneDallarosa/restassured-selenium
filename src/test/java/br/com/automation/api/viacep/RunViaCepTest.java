package br.com.automation.api.viacep;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-viacep.json", "html:target/cucumber-viacep"})
public class RunViaCepTest {
}
