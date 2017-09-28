package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/28.
 */

public class AQI {
    @SerializedName("city")
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}
