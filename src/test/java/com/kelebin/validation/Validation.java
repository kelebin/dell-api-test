package com.kelebin.validation;

import io.restassured.response.Response;

import java.util.Map;

public class Validation {

    public static boolean validateBodyResponse(Response response, String city, String state) {

        Map<String, String> jsonResponse = response.jsonPath().getMap("$");

        boolean resultado =    jsonResponse.get("city").equals(city)
                            && jsonResponse.get("State").equals(state);
        return resultado;
    }
}
