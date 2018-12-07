package com.yfbx.highchartdemo.js;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.google.gson.JsonArray;
import com.yfbx.highchartdemo.bean.KeyValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Edward
 * Date:2018/10/11
 * Description:
 */

public class PieChart extends BaseChart {


    private List<KeyValue> data;


    public static void load(WebView webView) {
        new PieChart(webView).loadData();
    }

    public PieChart(WebView webView) {
        super(webView);
    }


    @Override
    String loadChartHtml() {
        return "PieChart.html";
    }

    @Override
    Object attachJsInterface() {
        return this;
    }


    public void loadData() {
        data = new ArrayList<>();
        data.add(new KeyValue("Firefox", 45.0f));
        data.add(new KeyValue("IE", 26.8f));
        data.add(new KeyValue("Chrome", 12.8f));
        data.add(new KeyValue("Safari", 8.5f));
        data.add(new KeyValue("Opera", 6.2f));
        data.add(new KeyValue("Others", 0.7f));
    }


    @JavascriptInterface
    public String data() {
        JsonArray array = new JsonArray();
        for (KeyValue datum : data) {
            JsonArray keyValue = new JsonArray();
            keyValue.add(datum.key);
            keyValue.add(datum.value);
            array.add(keyValue);
        }
        return array.toString();
    }
}
