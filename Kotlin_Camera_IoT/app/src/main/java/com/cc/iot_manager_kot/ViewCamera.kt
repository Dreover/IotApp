package com.cc.iot_manager_kot

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class ViewCamera : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient() // This is important to prevent the URL from opening in an external browser

        // Enable JavaScript (if needed)
        // Enable JavaScript (if needed)
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true

        webView.clearCache(true)
        webView.clearHistory()

        val videoURL = "http://172.20.20.20:5000/video_feed"
        webView.loadUrl(videoURL)
    }
}