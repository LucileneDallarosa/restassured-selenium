package br.com.automation.api.viacep;

import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;

import org.junit.Before;
import io.restassured.specification.RequestSpecification;

public class BaseTest {

    protected RequestSpecification spec;

    @Before
    void initialize() {
        enableLoggingOfRequestAndResponseIfValidationFails();
    }

}
