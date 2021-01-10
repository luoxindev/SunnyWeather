package com.example.sunnyweather.logic.network;

import com.example.sunnyweather.SunnyWeatherApplication;
import com.example.sunnyweather.logic.model.PlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlaceService {

    @GET("v2/place?token="+SunnyWeatherApplication.TOKEN+"&lang=zh_CN")
    Call<PlaceResponse>  searchPlaces(@Query("query")String query);
    //调用searchPlaces（）方法时，Retrofit自动发起一条GET请求，去访问@GET注释中配置的地址，搜索API中只有query是需要动态指定的
}
