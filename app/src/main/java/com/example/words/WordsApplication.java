package com.example.words;

import android.app.Application;
import android.content.Context;

/**
 * Created by 杨浩 on 2016/9/19.
 */
public class WordsApplication extends Application {
    private static Context context;
    public static Context getContext(){
        return WordsApplication.context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        WordsApplication.context=getApplicationContext();
    }
}