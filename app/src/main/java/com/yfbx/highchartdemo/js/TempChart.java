package com.yfbx.highchartdemo.js;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Edward
 * Date:2018/10/10
 * Description:
 */

public class TempChart extends BaseChart {

    private String tokyo;
    private String newyork;
    private String london;

    public TempChart(WebView webView) {
        super(webView);
    }

    @Override
    String loadChartHtml() {
        return "TempChart.html";
    }

    @Override
    Object attachJsInterface() {
        return this;
    }


    public void loadData() {
        List<Double> tkList = new ArrayList<>();
        tkList.add(7.0);
        tkList.add(6.9);
        tkList.add(9.5);
        tkList.add(14.5);
        tkList.add(18.2);
        tkList.add(21.5);
        tkList.add(25.2);
        tkList.add(26.5);
        tkList.add(23.3);
        tkList.add(18.3);
        tkList.add(13.9);
        tkList.add(9.6);
        tokyo = new Gson().toJsonTree(tkList).toString();

        List<Double> nyList = new ArrayList<>();
        nyList.add(-0.2);
        nyList.add(0.8);
        nyList.add(5.7);
        nyList.add(11.3);
        nyList.add(17.0);
        nyList.add(22.0);
        nyList.add(24.8);
        nyList.add(24.1);
        nyList.add(20.1);
        nyList.add(14.1);
        nyList.add(8.6);
        nyList.add(2.5);
        newyork = new Gson().toJsonTree(nyList).toString();

        List<Double> ldList = new ArrayList<>();
        ldList.add(3.9);
        ldList.add(4.2);
        ldList.add(5.7);
        ldList.add(8.5);
        ldList.add(11.9);
        ldList.add(15.2);
        ldList.add(17.0);
        ldList.add(16.6);
        ldList.add(14.2);
        ldList.add(10.3);
        ldList.add(6.6);
        ldList.add(4.8);
        london = new Gson().toJsonTree(ldList).toString();
    }

    @JavascriptInterface
    public String listTokyo() {
        return tokyo;
    }

    @JavascriptInterface
    public String listNewYork() {
        return newyork;
    }

    @JavascriptInterface
    public String listLondon() {
        return london;
    }


}
