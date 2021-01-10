package com.example.sunnyweather;

import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
    public static final String TOKEN = "OofATlOOrAXtNPRr";
    private static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
        super.onCreate();
    }
    public static Context getContext(){
        return context;
    }



}
