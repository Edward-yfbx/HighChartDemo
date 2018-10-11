package com.yfbx.highchartdemo.js;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.google.gson.JsonArray;
import com.yfbx.highchartdemo.bean.KeyValue;

import java.util.List;

/**
 * Author:Edward
 * Date:2018/10/10
 * Description:
 */

public class LineChart {

    private JsonArray categories = new JsonArray();
    private JsonArray values = new JsonArray();

    public static void setData(WebView chart, List<KeyValue> data) {
        chart.addJavascriptInterface(new LineChart(data), "LineChart");
    }

    private LineChart(List<KeyValue> data) {
        for (KeyValue datum : data) {
            categories.add(datum.key);
            values.add(datum.value);
        }
    }

    @JavascriptInterface
    public String categories() {
        return categories.toString();
    }

    
    @JavascriptInterface
    public String data() {
        return values.toString();
    }
}
