package com.codizious_shopping;

import android.app.Application;

import com.karumi.dexter.Dexter;

//aa
public class MyApplication extends Application {
    @Override public void onCreate() {
        super.onCreate();
        Dexter.initialize(this);
    }
}