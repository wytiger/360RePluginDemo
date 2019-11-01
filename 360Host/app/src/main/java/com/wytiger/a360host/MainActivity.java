package com.wytiger.a360host;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void installPlugin(View v) {
        RePlugin.install("/sdcard/exam.apk");
    }

    public void preloadPlugin(View v) {
        RePlugin.preload("exam");
    }

    public void startPlugin(View v) {
        RePlugin.startActivity(MainActivity.this, RePlugin.createIntent("com.wytiger.a360plugin",
                "com.wytiger.a360plugin.PluginActivity"));
    }
}
