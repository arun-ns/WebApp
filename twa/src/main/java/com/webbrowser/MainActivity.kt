package com.webbrowser

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.androidbrowserhelper.trusted.LauncherActivity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, LauncherActivity::class.java)
//        intent.setData(Uri.parse("http://192.168.1.142:8000"))
        intent.setData(Uri.parse("https://www.superlist.com"))
        startActivity(intent)
        finish()
    }
}