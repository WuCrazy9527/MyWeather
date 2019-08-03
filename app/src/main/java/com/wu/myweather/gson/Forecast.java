package com.wu.myweather.gson;

import com.google.gson.annotations.SerializedName;

/*
    Date: 2019-08-03
    Time: 11:05
    created by: WuCrazy
*/
public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
