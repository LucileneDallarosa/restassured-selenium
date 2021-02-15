package br.com.automation.selenium.automationtesting.service;

import com.paulhammant.ngwebdriver.ByAngular;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DSL {

    private final WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getById(String id) {
        return driver.findElement(By.id(id));
    }

    public WebElement getByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement getByAngularModel(String model) {
        return driver.findElement(ByAngular.model(model));
    }
}
