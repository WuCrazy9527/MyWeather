package com.wu.myweather.gson;

/*
    Date: 2019-08-03
    Time: 10:57
    created by: WuCrazy
*/
public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
