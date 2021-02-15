package br.com.automation.selenium.automationtesting.utils;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptHelper {

    private final WebDriver driver;

    public JavaScriptHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void waitToLoadPage() {
        NgWebDriver ngDriver = new NgWebDriver((JavascriptExecutor) driver);
        ngDriver.waitForAngularRequestsToFinish();
    }
}
