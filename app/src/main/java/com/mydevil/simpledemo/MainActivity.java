package com.mydevil.simpledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mydevil.simpledemo.demo.ArTestActivity;
import com.mydevil.simpledemo.demo.WebViewDemoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void wvBtnClick(View view) {
        WebViewDemoActivity.startWebViewDemoActivity(this);
    }
    public void arTest(View view) {
        ArTestActivity.startArTestActivity(this);
    }
}
