package com.yfbx.highchartdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.yfbx.highchartdemo.R;
import com.yfbx.highchartdemo.js.LineChart;
import com.yfbx.highchartdemo.js.TempChart;

/**
 * Author:Edward
 * Date:2018/10/11
 * Description:
 */

public class LineChartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        WebView chartView = findViewById(R.id.line_chart);
        WebView tempChart = findViewById(R.id.temp_chart);

        new LineChart(chartView).loadData();
        new TempChart(tempChart).loadData();
    }

}
