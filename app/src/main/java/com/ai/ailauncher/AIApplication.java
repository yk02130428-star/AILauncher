package com.ai.ailauncher;

import android.app.Application;
import android.util.Log;

public class AIApplication extends Application {

    private static final String TAG = "AIApplication";

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: c to Ai launcher");
        super.onCreate();
    }
}
