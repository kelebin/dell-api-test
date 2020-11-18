package com.kelebin.test;

import com.kelebin.utils.HttpStatusEnum;
import com.kelebin.utils.RequestGenerator;
import com.kelebin.utils.UrlUtil;
import com.kelebin.validation.Validation;
import io.restassured.response.Response;
import org.codehaus.groovy.ast.stmt.TryCatchStatement;
import org.junit.Test;



import static com.kelebin.utils.UrlUtil.urlAPI;
import static junit.framework.Assert.assertTrue;

public class WeatherByCityAPITest {

    public String city =  "Round Rock";
    public String state = "TX";


    public RequestGenerator request = new RequestGenerator();

    @Test
    public void test1(){

        Response response = request.genericRequestGET(UrlUtil.license,city,state, urlAPI,HttpStatusEnum.OK.getCode());

        assertTrue(Validation.validateBodyResponse(response,city,state));
    }

}
