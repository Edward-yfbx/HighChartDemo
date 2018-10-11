package com.yfbx.highchartdemo.activity;

import android.app.Activity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Author:Edward
 * Date:2018/10/10
 * Description:
 */

public abstract class ChartWebViewActivity extends Activity {

    protected void initChart(WebView webView, String chartHtml) {
        webView.setWebViewClient(new MyWebViewClient(webView));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheMaxSize(8 * 1024 * 1024);
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        settings.setLoadsImagesAutomatically(true);
        loadChart(webView, chartHtml);
    }

    protected void loadChart(WebView webView, String chartName) {
        String url = "file:///android_asset/" + chartName;
        webView.loadUrl(url);
    }


    class MyWebViewClient extends WebViewClient {

        private WebView webView;

        public MyWebViewClient(WebView webView) {
            this.webView = webView;
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // 返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            if (!webView.getSettings().getLoadsImagesAutomatically()) {
                webView.getSettings().setLoadsImagesAutomatically(true);
            }
        }
    }
}
