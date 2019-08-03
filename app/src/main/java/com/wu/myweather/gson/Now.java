package com.wu.myweather.gson;

import com.google.gson.annotations.SerializedName;

/*
    Date: 2019-08-03
    Time: 10:58
    created by: WuCrazy
*/
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
