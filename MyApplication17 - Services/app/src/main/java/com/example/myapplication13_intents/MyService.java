package com.example.myapplication13_intents;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "myapplication13_intents";

    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"onStartCommand method called");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<5; i++ ){
                    long futureTime = System.currentTimeMillis() + 5000;
                    while(System.currentTimeMillis()<futureTime){
                        synchronized (this){
                            try{
                                wait(futureTime-System.currentTimeMillis());
                                Log.i(TAG,"Service is doing something");
                            }
                            catch (Exception e){}
                        }
                    }
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"onDestroy method called");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
