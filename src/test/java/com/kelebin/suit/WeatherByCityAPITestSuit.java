package com.kelebin.suit;


import com.kelebin.test.WeatherByCityAPITestBadRequest;
import com.kelebin.test.WeatherByCityAPITestNotFound;
import com.kelebin.test.WeatherByCityAPITestSuccess;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        WeatherByCityAPITestSuccess.class,
        WeatherByCityAPITestNotFound.class,
        WeatherByCityAPITestBadRequest.class
})
public class WeatherByCityAPITestSuit {
}
