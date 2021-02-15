package br.com.automation.api.viacep;

import br.com.automation.api.viacep.request.specification.ViacepRequestSpecification;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static br.com.automation.api.viacep.utils.Contract.getContract;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.junit.Assert.assertEquals;

public class ViaCepStepdefs extends BaseTest {

    protected Response response;
    protected String cep;

    @Given("^Want zip code information (.+) from uri (.+) and path (.+)$")
    public void searchByCep(String zipCode, String url, String path) {
        spec = new ViacepRequestSpecification().getRequestSpecification(url, path);
        this.cep = zipCode;
    }

    @When("^Make the request$")
    public void makeTheRequest() {
        response = given()
                .spec(spec)
                .pathParam("cep", cep.replace("-", ""))
                .when()
                .get();
    }

    @Then("^The HttpStatus is (.+)$")
    public void validateStatusResponse(int statusCode) {
        assertEquals(response.statusCode(), statusCode);
    }

    @Then("^The Response Body is valid$")
    public void validateBodyResponse() {
        response.then()
                .assertThat()
                .body(matchesJsonSchema(getContract("get_viacep_ws_schema")));
    }

    @Then("^The Reponse is cep: (.+), logradouro: (.+), complemento: (.+), bairro: (.+), localidade: (.+), uf: (.+), ibge: (.+)$")
    public void validateAcceptableViacep(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String ibge) {

        JsonPath responseBody = response
                .then()
                .extract()
                .body()
                .jsonPath();

        assertEquals(cep, responseBody.getString("cep"));
        assertEquals(logradouro, responseBody.getString("logradouro"));
        assertEquals(complemento, responseBody.getString("complemento"));
        assertEquals(bairro, responseBody.getString("bairro"));
        assertEquals(localidade, responseBody.getString("localidade"));
        assertEquals(uf, responseBody.getString("uf"));
        assertEquals(ibge, responseBody.getString("ibge"));
    }

}
