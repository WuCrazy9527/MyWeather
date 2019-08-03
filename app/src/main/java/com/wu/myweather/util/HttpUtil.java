package com.wu.myweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/*
    Date: 2019-08-03
    Time: 08:48
    created by: WuCrazy
*/
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
