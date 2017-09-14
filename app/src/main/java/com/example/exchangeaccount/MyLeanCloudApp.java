package com.example.exchangeaccount;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by 特西 on 2017/9/14.
 */

public class MyLeanCloudApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this,"H7bjVqfSheUXQIWaOrISLn1e-gzGzoHsz","QvdfYWBg53vnh3Mp60NSgAFR");
        // 放在 SDK 初始化语句 AVOSCloud.initialize() 后面，只需要调用一次即可
        AVOSCloud.setDebugLogEnabled(true);
    }
}
