package com.wu.myweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
    Date: 2019-08-03
    Time: 11:10
    created by: WuCrazy
*/
public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
