package com.yfbx.highchartdemo.js;

import android.webkit.WebView;

/**
 * Author: Edward
 * Date: 2018/12/7
 * Description:
 */


public class BrowserChart extends BaseChart {


    public static void load(WebView webView) {
        new BrowserChart(webView);
    }

    public BrowserChart(WebView webView) {
        super(webView);
    }

    @Override
    String loadChartHtml() {
        return "BrowserChart.html";
    }

    @Override
    Object attachJsInterface() {
        return this;
    }

}
