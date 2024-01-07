package com.webbrowser;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;

public class JavaScriptInterface {
    private WebView webView;

    public JavaScriptInterface(WebView webView) {
        this.webView = webView;
    }

    @JavascriptInterface
    public void showToast(String message) {
        Toast.makeText(webView.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
