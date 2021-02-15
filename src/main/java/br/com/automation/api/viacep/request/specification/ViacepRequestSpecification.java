package br.com.automation.api.viacep.request.specification;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;

import static io.restassured.http.ContentType.JSON;

public class ViacepRequestSpecification {

    public RequestSpecification getRequestSpecification(String url, String path) {
        return new RequestSpecBuilder()
                .setConfig(
                        new RestAssuredConfig()
                                .sslConfig(
                                        new SSLConfig().relaxedHTTPSValidation()
                                )
                                .logConfig(LogConfig
                                        .logConfig()
                                        .enablePrettyPrinting(true)
                                        .enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL)
                                )
                )
                .setContentType(JSON)
                .setBaseUri(url)
                .setBasePath(path)
                .setRelaxedHTTPSValidation()
                .setContentType(JSON)
                .log(LogDetail.ALL)
                .build();
    }

}