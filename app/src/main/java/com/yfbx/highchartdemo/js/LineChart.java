package com.yfbx.highchartdemo.js;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.google.gson.Gson;

/**
 * Author:Edward
 * Date:2018/10/10
 * Description:
 */

public class LineChart extends BaseChart {

    private String categories;
    private String values;


    public LineChart(WebView webView) {
        super(webView);
    }

    @Override
    String loadChartHtml() {
        return "LineChart.html";
    }

    @Override
    Object attachJsInterface() {
        return this;
    }

    public void loadData() {
        String[] array = {"09/10", "09/11", "09/12", "09/13", "09/14", "09/15", "09/16"};
        categories = new Gson().toJsonTree(array).toString();

        Integer[] value = {14, 16, 21, 21, 19, 16, 14};
        values = new Gson().toJsonTree(value).toString();
    }

    @JavascriptInterface
    public String categories() {
        return categories;
    }


    @JavascriptInterface
    public String data() {
        return values;
    }


}
