package com.example.a10648.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by lizheng on 2016/5/26 0026.
 */
public class MyService extends Service {
    private DownloadBinder mBinder =  new DownloadBinder();

    class  DownloadBinder extends Binder{
        public void startDownload(){
            Log.d("MyService", "startDownload  ");
        }
        public int getProgress(){
            Log.d("MyService", "getProgress  ");
            return 0;
        }
    }
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyService", "onCreate executed");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService", "onStartCommand executed");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyService", "onDestroy executed");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}
