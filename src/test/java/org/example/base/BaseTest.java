package org.example.base;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.Asserts.AssertionActions;
import org.example.endpoints.APIConstants;
import org.example.modules.PayloadManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

    public RequestSpecification requestSpecification;
    public AssertionActions assertionActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;


    @BeforeTest
    public void setUp()
    {
        //base url, content type - json
        payloadManager = new PayloadManager();
        assertionActions = new AssertionActions();
        requestSpecification = RestAssured.given().baseUri(APIConstants.baseUrl)
                                          .contentType(ContentType.JSON).log().all();
    }
}
