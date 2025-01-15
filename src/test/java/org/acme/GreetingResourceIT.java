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
    
    /**
     * Create Table via DBeaver
     * create table MyEntity (firstIdField uuid not null, secondIdField uuid not null, description varchar(255), name varchar(255), primary key (firstIdField, secondIdField));
     */
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

}
