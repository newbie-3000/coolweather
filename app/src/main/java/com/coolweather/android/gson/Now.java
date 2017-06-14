package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangyi on 2017/6/14.
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
