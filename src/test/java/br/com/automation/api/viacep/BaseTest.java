package br.com.automation.api.viacep;

import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;

public class BaseTest {

    protected RequestSpecification spec;

    @Before
    void initialize() {
        enableLoggingOfRequestAndResponseIfValidationFails();
    }

}
