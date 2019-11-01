package com.wytiger.a360host;

import android.app.Application;
import android.content.Context;

/**
 * description ：
 * author : wuyong_cd
 * date : 2019/11/1 0001
 */
public class HostApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        RePlugin.App.attachBaseContext(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        RePlugin.App.onCreate();
    }
}
