package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/2/1.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    /**
     *  json数据字段不能直接作为java命名，适用@SerializedName注解
     *  让json和java字段建立映射关系
     **/
    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
