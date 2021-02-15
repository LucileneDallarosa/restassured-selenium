package br.com.automation.api.viacep;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-viacep.json", "html:target/cucumber-viacep"})
public class RunViaCepTest {
}
