package stm.zuuledgeservice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LiveTest {

//    @Test
    public void whenSendRequestToFooResource_thenOK() {
        final Response response = RestAssured.get("http://localhost:8091/payments/hello");
        assertEquals(200, response.getStatusCode());
    }

//    @Test
    public void whenSendRequest_thenHeaderAdded() {
        final Response response = RestAssured.get("http://localhost:8091/payments/hello");
        assertEquals(200, response.getStatusCode());
        assertEquals("TestSample", response.getHeader("Test"));
    }
}