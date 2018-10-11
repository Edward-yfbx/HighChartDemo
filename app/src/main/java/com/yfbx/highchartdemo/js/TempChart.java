package com.yfbx.highchartdemo.js;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.google.gson.JsonArray;

import java.util.List;

/**
 * Author:Edward
 * Date:2018/10/10
 * Description:
 */

public class TempChart {

    private List<Double> tkList;
    private List<Double> nyList;
    private List<Double> ldList;

    public static void setData(WebView chart, List<Double> tkList, List<Double> nyList, List<Double> ldList) {
        chart.addJavascriptInterface(new TempChart(tkList, nyList, ldList), "TempChart");
    }

    public TempChart(List<Double> tkList, List<Double> nyList, List<Double> ldList) {
        this.tkList = tkList;
        this.nyList = nyList;
        this.ldList = ldList;
    }

    @JavascriptInterface
    public String listTokyo() {
        JsonArray arrayTokyo = new JsonArray();
        for (Double data : tkList) {
            arrayTokyo.add(data);
        }
        return arrayTokyo.toString();
    }

    @JavascriptInterface
    public String listNewYork() {
        JsonArray arrayNewYork = new JsonArray();
        for (Double data : nyList) {
            arrayNewYork.add(data);
        }
        return arrayNewYork.toString();
    }

    @JavascriptInterface
    public String listLondon() {
        JsonArray arrayLondon = new JsonArray();
        for (Double data : ldList) {
            arrayLondon.add(data);
        }
        return arrayLondon.toString();
    }


}
