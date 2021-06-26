package com.webbrowser;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.androidbrowserhelper.trusted.LauncherActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    /*    TwaLauncher launcher = new TwaLauncher(this);
        launcher.launch(Uri.parse("https://google.com"));*/
        Intent intent = new Intent(this, LauncherActivity.class);
        intent.setData(
                Uri.parse("http://twitch.com/"));
        startActivity(intent);
        finish();
    }
}