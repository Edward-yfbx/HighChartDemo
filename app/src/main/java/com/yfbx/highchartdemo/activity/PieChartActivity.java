package com.yfbx.highchartdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

import com.yfbx.highchartdemo.R;
import com.yfbx.highchartdemo.js.BrowserChart;
import com.yfbx.highchartdemo.js.PieChart;

/**
 * Author:Edward
 * Date:2018/10/11
 * Description:
 */

public class PieChartActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        WebView browserChart = findViewById(R.id.browser_chart);
        WebView pieChart = findViewById(R.id.pie_chart);

        PieChart.load(pieChart);
        BrowserChart.load(browserChart);

    }
}
