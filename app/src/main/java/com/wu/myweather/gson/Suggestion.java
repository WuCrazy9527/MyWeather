package com.wu.myweather.gson;

import com.google.gson.annotations.SerializedName;

/*
    Date: 2019-08-03
    Time: 11:01
    created by: WuCrazy
*/
public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
