package br.com.automation.selenium.automationtesting;

import br.com.automation.selenium.automationtesting.page.page.RegisterPage;
import br.com.automation.selenium.automationtesting.utils.JavaScriptHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;

    protected JavaScriptHelper javaScriptHelper;

    protected RegisterPage registerPage;

    public void openWebSite(String url) {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        javaScriptHelper = new JavaScriptHelper(driver);

        registerPage = new RegisterPage(driver);

        javaScriptHelper.waitToLoadPage();
    }

    public void closeWebSite() {
        driver.quit();
    }

}
