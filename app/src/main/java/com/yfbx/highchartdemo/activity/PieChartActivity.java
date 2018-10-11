package com.yfbx.highchartdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

import com.yfbx.highchartdemo.R;
import com.yfbx.highchartdemo.bean.KeyValue;
import com.yfbx.highchartdemo.js.PieChart;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:Edward
 * Date:2018/10/11
 * Description:
 */

public class PieChartActivity extends ChartWebViewActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);
        WebView browserChart = findViewById(R.id.browser_chart);
        WebView pieChart = findViewById(R.id.pie_chart);

        initChart(browserChart, "BrowserChart.html");
        initChart(pieChart, "PieChart.html");

        //得到数据后调用
        PieChart.setData(pieChart, getTestData());
    }


    /**
     * 测试数据
     */
    private List<KeyValue> getTestData() {
        List<KeyValue> data = new ArrayList<>();
        data.add(new KeyValue("Firefox", 45.0f));
        data.add(new KeyValue("IE", 26.8f));
        data.add(new KeyValue("Chrome", 12.8f));
        data.add(new KeyValue("Safari", 8.5f));
        data.add(new KeyValue("Opera", 6.2f));
        data.add(new KeyValue("Others", 0.7f));
        return data;
    }
}
