package com.webbrowser

import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.webbrowser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpWebView()
    }

    private fun setUpWebView() {
        val webSettings = binding.webView.settings
        webSettings.loadsImagesAutomatically = true
        webSettings.allowContentAccess = true
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.databaseEnabled = true
        webSettings.javaScriptCanOpenWindowsAutomatically = true
        webSettings.mediaPlaybackRequiresUserGesture = false
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        webSettings.cacheMode = WebSettings.LOAD_NO_CACHE
        binding.webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                binding.progressBar.visibility = View.VISIBLE
                return super.shouldOverrideUrlLoading(view, request)
            }

            override fun onPageFinished(view: WebView, url: String) {
                binding.progressBar.visibility = View.GONE
                binding.webView.visibility = View.VISIBLE
            }
        }
        val jsInterface = JavaScriptInterface(binding.webView)
        binding.webView.addJavascriptInterface(jsInterface, "Android")
        binding.webView.webChromeClient = WebChromeClient()
//        binding.webView.loadUrl("http://192.168.1.142:8000")
        binding.webView.loadUrl("https://www.superlist.com")
    }
}