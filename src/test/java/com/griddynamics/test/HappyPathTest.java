package com.griddynamics.test;

import com.griddynamics.test.common.TestBase;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.http.ContentType.JSON;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author Timofei B.
 */
// @Epic
// @Feature
public class HappyPathTest extends TestBase {

    /*****************
     ***     positive
     ****************/

    @Test
    public void create() {
        final Map<String, Object> bodyAsMap = new HashMap<>();
        given().contentType(JSON).body(bodyAsMap).
                when().post().
                then().statusCode(SC_OK);
    }


    // @Description
    // @Story
    @Test
    public void read() {
        when().get("/lotto").then().body("lotto.lottoId", equalTo(5));
    }

    @Test
    public void update() {

        final Map<String, Object> bodyAsMap = new HashMap<>();

        given().contentType(JSON).body(bodyAsMap).
                when().put().
                then().statusCode(SC_OK);
    }

    @Test
    public void delete() {
        // TODO:
    }

    /*****************
     ***    negative
     ****************/
}
