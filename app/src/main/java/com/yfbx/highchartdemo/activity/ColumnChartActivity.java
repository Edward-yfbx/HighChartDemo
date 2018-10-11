package com.yfbx.highchartdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

import com.yfbx.highchartdemo.R;

/**
 * Author:Edward
 * Date:2018/10/11
 * Description:
 */

public class ColumnChartActivity extends ChartWebViewActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_column_chart);
        WebView columnChart = findViewById(R.id.column_chart);

        initChart(columnChart, "ColumnChart.html");
    }
}
