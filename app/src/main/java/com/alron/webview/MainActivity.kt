package com.alron.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)

        myWebView.addJavascriptInterface(WebAppInterface(this), "Android")
        myWebView.settings.javaScriptEnabled = true
        myWebView.webViewClient = WebViewClient()  // default WebViewClient
        myWebView.loadUrl("https://mail.google.com/") // Website URL
    }
}