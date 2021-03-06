package com.yfbx.highchartdemo.js;

import android.webkit.WebView;

/**
 * Author:Edward
 * Date:2018/10/11
 * Description:
 */

public class ColumnChart extends BaseChart {


    public static void load(WebView webView) {
        new ColumnChart(webView);
    }

    public ColumnChart(WebView webView) {
        super(webView);
    }

    @Override
    String loadChartHtml() {
        return "ColumnChart.html";
    }

    @Override
    Object attachJsInterface() {
        return this;
    }

}
