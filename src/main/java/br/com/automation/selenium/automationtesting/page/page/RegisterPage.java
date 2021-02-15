package br.com.automation.selenium.automationtesting.page.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import br.com.automation.selenium.automationtesting.page.enums.Gender;
import br.com.automation.selenium.automationtesting.page.enums.Hobbies;
import br.com.automation.selenium.automationtesting.service.DSL;

public class RegisterPage {

    private static final String CLASS = "class";
    final DSL dsl;

    public RegisterPage(WebDriver driver) {
        dsl = new DSL(driver);
    }

    public String getFirstNameClass() {
        return dsl.getByAngularModel("FirstName").getAttribute(CLASS);
    }

    public void setFirstName(String firstName) {
        dsl.getByAngularModel("FirstName").sendKeys(firstName);
    }

    public String getLastNameClass() {
        return dsl.getByAngularModel("LastName").getAttribute(CLASS);
    }

    public void setLastName(String lastName) {
        dsl.getByAngularModel("LastName").sendKeys(lastName);
    }

    public void setAdress(String address) {
        dsl.getByAngularModel("Adress").sendKeys(address);
    }

    public String getEmailAdressClass() {
        return dsl.getByAngularModel("EmailAdress").getAttribute(CLASS);
    }

    public void setEmailAdress(String emailAddress) {
        dsl.getByAngularModel("EmailAdress").sendKeys(emailAddress);
    }

    public String getPhoneClass() {
        return dsl.getByAngularModel("Phone").getAttribute(CLASS);
    }

    public void setPhone(String phone) {
        dsl.getByAngularModel("Phone").sendKeys(phone);
    }

    public void setGender(Gender gender) {
        switch (gender) {
            case Male:
                dsl.getByXpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input").click();
                break;
            case Female:
                dsl.getByXpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input").click();
                break;
        }
    }

    public void setHobbies(Hobbies hobbies) {
        switch (hobbies) {
            case Cricket:
                dsl.getById("checkbox1").click();
                break;
            case Movies:
                dsl.getById("checkbox2").click();
                break;
            case Hockey:
                dsl.getById("checkbox3").click();
                break;
        }
    }

    public void setSkills(String skills) {
        Select skillSelect = new Select(dsl.getByAngularModel("Skill"));
        skillSelect.selectByVisibleText(skills);
    }

    public String getCountryClass() {
        return dsl.getByAngularModel("country").getAttribute(CLASS);
    }

    public void setCountry(String countries) {
        Select countrySelect = new Select(dsl.getByAngularModel("country"));
        countrySelect.selectByVisibleText(countries);
    }

    public String getDateOfBirthYearClass() {
        return dsl.getByAngularModel("yearbox").getAttribute(CLASS);
    }

    public void setDateOfBirthYear(String yearbox) {
        Select yearboxSelect = new Select(dsl.getByAngularModel("yearbox"));
        yearboxSelect.selectByVisibleText(yearbox);
    }

    public String getDateOfBirthMonthClass() {
        return dsl.getByAngularModel("monthbox").getAttribute(CLASS);
    }

    public void setDateOfBirthMonth(String monthbox) {
        Select monthboxSelect = new Select(dsl.getByAngularModel("monthbox"));
        monthboxSelect.selectByVisibleText(monthbox);
    }

    public String getDateOfBirthDayClass() {
        return dsl.getByAngularModel("daybox").getAttribute(CLASS);
    }

    public void setDateOfBirthDay(String daybox) {
        Select dayboxSelect = new Select(dsl.getByAngularModel("daybox"));
        dayboxSelect.selectByVisibleText(daybox);
    }

    public String getPasswordClass() {
        return dsl.getByAngularModel("Password").getAttribute(CLASS);
    }

    public void setPassword(String password) {
        dsl.getByAngularModel("Password").sendKeys(password);
    }

    public String getCPasswordClass() {
        return dsl.getByAngularModel("CPassword").getAttribute(CLASS);
    }

    public void setCPassword(String cPassword) {
        dsl.getByAngularModel("CPassword").sendKeys(cPassword);
    }

    public String getClassForm() {
        return dsl.getById("basicBootstrapForm").getAttribute("class");
    }

    public void clickButtonSumit() {
        dsl.getById("submitbtn").click();
    }
}