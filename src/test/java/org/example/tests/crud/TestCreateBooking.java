package org.example.tests.crud;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.example.base.BaseTest;
import org.example.endpoints.APIConstants;
import org.example.pojos.BookingResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateBooking extends BaseTest {
    @Test(groups = "qa", priority = 1)
    @Description("TC#INT1 - Step1 verify booking can be created")
    public void testCreateBooking()
    {
        requestSpecification.basePath(APIConstants.updateBookingUrl);

        response = RestAssured.given(requestSpecification).
                               when().body(payloadManager.createBookingPayloadAsString()).
                               post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());
        assertionActions.verifyStringKey(bookingResponse.getBooking().getFirstname(),"Megha");
    }
}
