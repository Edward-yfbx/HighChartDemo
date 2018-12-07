package com.yfbx.highchartdemo.js;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * Author:Edward
 * Date:2018/10/10
 * Description:
 */

public class TestChart extends BaseChart {


    public TestChart(WebView webView) {
        super(webView);
    }

    @Override
    String loadChartHtml() {
        return "TestChart.html";
    }

    @Override
    Object attachJsInterface() {
        return this;
    }

    @JavascriptInterface
    public String title() {
        JsonObject title = new JsonObject();
        title.addProperty("text", "近七日维护数量");
        return title.toString();
    }

    @JavascriptInterface
    public String xAxis() {
        JsonArray categories = new JsonArray();
        categories.add("09/10");
        categories.add("09/11");
        categories.add("09/12");
        categories.add("09/13");
        categories.add("09/14");
        categories.add("09/15");
        categories.add("09/16");

        JsonObject xAxis = new JsonObject();
        xAxis.add("categories", categories);
        return xAxis.toString();
    }

    @JavascriptInterface
    public String yAxis() {
        JsonObject title = new JsonObject();
        title.addProperty("text", "");

        JsonArray plotLines = new JsonArray();
        JsonObject object = new JsonObject();
        object.addProperty("value", 0);
        object.addProperty("width", 1);
        object.addProperty("color", "#808080");
        plotLines.add(object);

        JsonObject yAxis = new JsonObject();
        yAxis.add("title", title);
        yAxis.add("plotLines", plotLines);
        return yAxis.toString();
    }


    @JavascriptInterface
    public String series() {
        JsonArray values = new JsonArray();
        values.add(14);
        values.add(16);
        values.add(21);
        values.add(21);
        values.add(19);
        values.add(16);
        values.add(14);

        JsonObject data = new JsonObject();
        data.addProperty("name", "维护数量");
        data.add("data", values);

        JsonArray series = new JsonArray();
        series.add(data);

        return series.toString();

    }


}
