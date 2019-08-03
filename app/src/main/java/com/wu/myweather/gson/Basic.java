package com.wu.myweather.gson;

import com.google.gson.annotations.SerializedName;



/*
    Date: 2019-08-03
    Time: 10:44
    created by: WuCrazy
*/
public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
