package com.ai.ailauncher;

import android.app.Application;
import android.util.Log;

public class AIApplication extends Application {

    private static final String TAG = "AIApplication";

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: welcome to Ai launcher");
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }
}
