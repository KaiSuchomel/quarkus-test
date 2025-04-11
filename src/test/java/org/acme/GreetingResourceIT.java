package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

@QuarkusTest
class GreetingResourceIT {

    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello from Quarkus REST"));
    }

    @Test
    void testEntityEndpoint() {
        given()
                .when().get("/hello/entity")
                .then()
                .statusCode(200)
                .body("name", is("MyTests"))
                .body("firstIdField", is(notNullValue()))
                .body("secondIdField", is(notNullValue()));
    }

    @Test
    void testRevisionEndpoint() {
        given()
                .when().get("/hello/revision")
                .then()
                .statusCode(200)
                .body("id", is(123));
    }

}
