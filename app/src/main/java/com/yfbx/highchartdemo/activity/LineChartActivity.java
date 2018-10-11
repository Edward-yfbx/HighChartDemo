package com.yfbx.highchartdemo.activity;

import android.os.Bundle;
import android.webkit.WebView;

import com.yfbx.highchartdemo.R;
import com.yfbx.highchartdemo.bean.KeyValue;
import com.yfbx.highchartdemo.js.LineChart;
import com.yfbx.highchartdemo.js.TempChart;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Edward
 * Date:2018/10/11
 * Description:
 */

public class LineChartActivity extends ChartWebViewActivity {

    List<Double> tkList = new ArrayList<>();
    List<Double> nyList = new ArrayList<>();
    List<Double> ldList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        WebView lineChart = findViewById(R.id.line_chart);
        WebView tempChart = findViewById(R.id.temp_chart);
        getTempData();

        initChart(lineChart, "LineChart.html");
        initChart(tempChart, "TempChart.html");

        LineChart.setData(lineChart, getTestData());
        TempChart.setData(tempChart, tkList, nyList, ldList);

    }

    /**
     * 测试数据
     */
    private List<KeyValue> getTestData() {
        List<KeyValue> data = new ArrayList<>();
        data.add(new KeyValue("09/10", 14));
        data.add(new KeyValue("09/11", 16));
        data.add(new KeyValue("09/12", 21));
        data.add(new KeyValue("09/13", 21));
        data.add(new KeyValue("09/14", 19));
        data.add(new KeyValue("09/15", 16));
        data.add(new KeyValue("09/16", 14));
        return data;
    }


    /**
     * 测试数据
     */
    public void getTempData() {

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
    }

}
