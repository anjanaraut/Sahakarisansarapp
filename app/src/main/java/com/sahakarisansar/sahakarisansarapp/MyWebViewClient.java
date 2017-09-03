package com.sahakarisansar.sahakarisansarapp;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * Created by AM on 7/30/2017.
 */

public class MyWebViewClient extends WebViewClient {
    @Override

    public void onPageFinished(WebView view, String url) {
        //remove your progressdialog here

        super.onPageFinished(view, url);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        //show your progressdialog here
        super.onPageStarted(view, url, favicon);
    }
}

