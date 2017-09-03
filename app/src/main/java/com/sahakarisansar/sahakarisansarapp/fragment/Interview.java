package com.sahakarisansar.sahakarisansarapp.fragment;


import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.sahakarisansar.sahakarisansarapp.MyWebViewClient;
import com.sahakarisansar.sahakarisansarapp.R;

public class Interview extends Fragment {
        View myView;
        WebView mwebview;
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            myView = inflater.inflate(R.layout.tab2interview, container, false);

            mwebview = (WebView) myView.findViewById(R.id.mwebview);

            WebSettings webSetting = mwebview.getSettings();
            mwebview.getSettings().setJavaScriptEnabled(true);
            mwebview.loadUrl("http://www.sahakarisansar.com/mobileapp/interview");

     /*   mwebview.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        mwebview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        mwebview.getSettings().setAppCacheEnabled(true);
        mwebview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSetting.setDomStorageEnabled(true);
        webSetting.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSetting.setUseWideViewPort(true);
        webSetting.setSavePassword(true);
        webSetting.setSaveFormData(true);
        webSetting.setEnableSmoothTransition(true);  */

            mwebview.setWebViewClient(new MyWebViewClient(){
                public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error){
                    //Your code to do
                    //mwebview.loadUrl("file:///android_asset/error.html");
                    //Toast.makeText(getApplicationContext(), "Please make sure you are connected to the internet and try again", Toast.LENGTH_LONG).show();
                }
                final ProgressDialog dialog = ProgressDialog.show(getActivity(), "", "Loading ...", true);
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    dialog.show();
                }

                @Override
                public void onPageFinished(WebView view, String url){
                    dialog.dismiss();
                }
            });

            webSetting.setDisplayZoomControls(true);
            return myView;
        }

    protected boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnectedOrConnecting()) {
            return true;
        } else {
            return false;
        }
    }
}


