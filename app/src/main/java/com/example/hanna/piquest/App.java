package com.example.hanna.piquest;

import android.app.Application;

/**
 * Created by Amanda on 2014-12-19.
 */
public class App extends Application {
    private static App instance;

    public static App getApp() {
        if (instance == null) {
            instance = new App();
        }
        return instance;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        instance = this;
    }
}

