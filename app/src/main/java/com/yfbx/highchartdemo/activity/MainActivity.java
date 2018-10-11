package com.yfbx.highchartdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yfbx.highchartdemo.R;

public class MainActivity extends ChartWebViewActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void lineChart(View view) {
        startActivity(new Intent(this, LineChartActivity.class));
    }

    public void pieChart(View view) {
        startActivity(new Intent(this, PieChartActivity.class));
    }

    public void columnChart(View view) {
        startActivity(new Intent(this, ColumnChartActivity.class));
    }

}
