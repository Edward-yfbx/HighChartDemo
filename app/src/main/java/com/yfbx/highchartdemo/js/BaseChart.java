package com.yfbx.highchartdemo.js;

import android.annotation.SuppressLint;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Author: Edward
 * Date: 2018/12/7
 * Description:
 */

@SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface"})
public abstract class BaseChart extends WebViewClient {


    WebView webView;

    public BaseChart(WebView webView) {
        this.webView = webView;
        initChart();
    }

    /**
     * 加载位于 assets 目录下的 Html文件
     */
    abstract String loadChartHtml();

    /**
     * JsInterface 接口类对象
     */
    abstract Object attachJsInterface();

    private void initChart() {
        webView.setWebViewClient(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_DEFAULT);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheMaxSize(8 * 1024 * 1024);
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        settings.setLoadsImagesAutomatically(true);
        loadHtml(loadChartHtml());
        Object object = attachJsInterface();
        webView.addJavascriptInterface(object, object.getClass().getSimpleName());
    }

    /**
     * 位于 assets 目录下的 Html文件
     */
    private void loadHtml(String chartHtml) {
        String url = "file:///android_asset/" + chartHtml;
        webView.loadUrl(url);
    }


    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
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
