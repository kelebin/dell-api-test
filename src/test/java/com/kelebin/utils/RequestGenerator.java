package com.kelebin.utils;

import java.util.Map;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

public class RequestGenerator {


    public Response genericRequestGET(String license,String city, String state, String url, Integer status) {

        RestAssured.defaultParser = Parser.JSON;

        return
                        RestAssured.
                        given()
                            .contentType(ContentType.JSON)
                            .queryParam(license)
                            .queryParam(city)
                            .queryParam(state)
                        .when()
                            .get(url)
                        .then()
                            .statusCode(status)
                            .contentType(ContentType.JSON).extract()
                            .response();
    }


}
