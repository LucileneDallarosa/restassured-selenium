package br.com.automation.selenium.automationtesting;

import br.com.automation.selenium.automationtesting.page.enums.Gender;
import br.com.automation.selenium.automationtesting.page.enums.Hobbies;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class RegisterStepdefs extends BaseTest {

    @Given("^Access WebPage (.+)$")
    public void openAautomationtestingRegisterWebPage(String url) {
        super.openWebSite(url);
    }

    @When("^Enter First Name with (.+)$")
    public void fillFirstNameWith(String firstName) {
        registerPage.setFirstName(firstName);
    }

    @When("^Enter Last Name with (.+)$")
    public void fillLastNameWith(String lastName) {
        registerPage.setLastName(lastName);
    }

    @When("^Enter Adress with (.+)$")
    public void fillAdressWith(String address) {
        registerPage.setAdress(address);
    }

    @When("^Enter Email Adress with (.+)$")
    public void fillEmailAdressWith(String emailAddress) {
        registerPage.setEmailAdress(emailAddress);
    }

    @When("^Enter Phone with (.+)$")
    public void fillPhoneWith(String phone) {
        registerPage.setPhone(phone);
    }

    @When("^Select the (.+) Gender$")
    public void selectGender(Gender gender) {
        registerPage.setGender(gender);
    }

    @When("^Select the (.+) Hobbies$")
    public void selectGender(Hobbies hobbies) {
        registerPage.setHobbies(hobbies);
    }

    @When("^Select the (.+) Skills$")
    public void selectSkills(String skills) {
        registerPage.setSkills(skills);
    }

    @When("^Select the (.+) Country$")
    public void selectCountry(String country) {
        registerPage.setCountry(country);
    }

    @When("^Select the Date Of Birth (.+) - (.+) - (.+)$")
    public void selectDateOfBirth(String day, String month, String year) {
        registerPage.setDateOfBirthDay(day);
        registerPage.setDateOfBirthMonth(month);
        registerPage.setDateOfBirthYear(year);
    }

    @When("^Enter Password with (.+)$")
    public void fillPasswordWith(String password) {
        registerPage.setPassword(password);
    }

    @When("^Enter Confirm Password with (.+)$")
    public void fillConfirmPasswordWith(String confirmPassword) {
        registerPage.setCPassword(confirmPassword);
    }

    @Then("^Register the user$")
    public void validateProceedWithTheOrder() {
        assertTrue(registerPage.getClassForm().contains("ng-valid-parse"));
        assertTrue(registerPage.getClassForm().contains("ng-valid-email"));
        assertTrue(registerPage.getClassForm().contains("ng-valid-pattern"));
        assertTrue(registerPage.getClassForm().contains("ng-valid-minlength"));
        assertTrue(registerPage.getClassForm().contains("ng-valid"));
        assertTrue(registerPage.getClassForm().contains("ng-valid-required"));

        //TODO Review this point when WebSite will be corrected.
        registerPage.clickButtonSumit();
    }

    @Then("^Form is Invalid$")
    public void validateFormNameClass() {
        assertTrue(registerPage.getClassForm().contains("ng-invalid"));
    }

    @Then("^First Name is Invalid$")
    public void validateFirstNameClass() {
        assertTrue(registerPage.getFirstNameClass().contains("ng-invalid"));
    }

    @Then("^Last Name is Invalid$")
    public void validateLastNameClass() {
        assertTrue(registerPage.getLastNameClass().contains("ng-invalid"));
    }

    @Then("^Email Adress is Invalid$")
    public void validateEmailAdressClass() {
        assertTrue(registerPage.getEmailAdressClass().contains("ng-invalid"));
    }

    @Then("^Phone is Invalid$")
    public void validatePhoneClass() {
        assertTrue(registerPage.getPhoneClass().contains("ng-invalid"));
    }

    @Then("^Country is Invalid$")
    public void validateCountryClass() {
        assertTrue(registerPage.getCountryClass().contains("ng-invalid"));
    }

    @Then("^Date Of Birth is Invalid$")
    public void validateDateOfBirthClass() {
        assertTrue(registerPage.getDateOfBirthYearClass().contains("ng-invalid"));
        assertTrue(registerPage.getDateOfBirthMonthClass().contains("ng-invalid"));
        assertTrue(registerPage.getDateOfBirthDayClass().contains("ng-invalid"));
    }

    @Then("^Password is Invalid$")
    public void validatePasswordClass() {
        assertTrue(registerPage.getPasswordClass().contains("ng-invalid"));
    }

    @Then("^CPassword is Invalid$")
    public void validateCPasswordClass() {
        assertTrue(registerPage.getCPasswordClass().contains("ng-invalid"));
    }

    @Then("^Close WebPage$")
    public void closeWebPage() {
        super.closeWebSite();
    }

}
