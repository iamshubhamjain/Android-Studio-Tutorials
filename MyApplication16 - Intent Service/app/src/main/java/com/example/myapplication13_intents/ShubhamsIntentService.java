package com.example.myapplication13_intents;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class ShubhamsIntentService extends IntentService {

    private static final String TAG = "com.thenewboston.intent";

    public ShubhamsIntentService(){
        super("ShubhamsIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG,"The service has now started");
    }
}
