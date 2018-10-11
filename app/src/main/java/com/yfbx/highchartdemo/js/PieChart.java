package com.yfbx.highchartdemo.js;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.google.gson.JsonArray;
import com.yfbx.highchartdemo.bean.KeyValue;

import java.util.List;

/**
 * Author:Edward
 * Date:2018/10/11
 * Description:
 */

public class PieChart {

    private List<KeyValue> data;

    public static void setData(WebView chart, List<KeyValue> data) {
        chart.addJavascriptInterface(new PieChart(data), "PieChart");
    }

    private PieChart(List<KeyValue> data) {
        this.data = data;
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
