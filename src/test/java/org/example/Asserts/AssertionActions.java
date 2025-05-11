package org.example.Asserts;

import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;

public class AssertionActions {

    public void verifyRespondBody(String actual,String expected,String description)
    {
        assertEquals(actual, expected, description);
    }

    public void verifyRespondBody(int actual,int expected,String description)
    {
        assertEquals(actual, expected, description);
    }

    public void verifyStatusCode(Response response, Integer expected)
    {
        assertEquals(response.getStatusCode(),expected);
    }

    public void verifyStringKey(String keyExpect,String keyActual)
    {
        assertThat(keyExpect).isNotNull();
        assertThat(keyExpect).isNotNull().isNotBlank();
        assertThat(keyExpect).isEqualTo(keyActual);
    }
}
