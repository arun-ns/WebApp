package com.webbrowser

import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.widget.Toast

class JavaScriptInterface(private val webView: WebView) {
    @JavascriptInterface
    fun showToast(message: String?) {
        Toast.makeText(webView.context, message, Toast.LENGTH_SHORT).show()
    }

    @JavascriptInterface
    fun printMessage(message: String?) {
        println("Message for Web : ${message}")
    }
}
