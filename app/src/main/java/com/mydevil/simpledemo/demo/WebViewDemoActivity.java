package com.mydevil.simpledemo.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

import com.mydevil.simpledemo.R;

/**
 * author:         hxd
 * creation date:  2017/6/8
 * desc ：
 */
public class WebViewDemoActivity extends Activity{
    WebView mWebView;

    public static void startWebViewDemoActivity(Context context){
        Intent intent=new Intent(context,WebViewDemoActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_demo);
        initView();
    }

    private void initView() {
        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.loadUrl("https:\\/\\/romwe.zendesk.com\\/access\\/jwt?jwt=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI3Y2Y5NGEzYTIxNzBjMzJhMGZlNTQxMjYzNWVkNTZlNiIsImlhdCI6MTQ5NjkwNzYxMSwibmFtZSI6Ijk5MzMyOTM2NiIsImVtYWlsIjoiOTkzMzI5MzY2QHFxLmNvbSJ9.BalbTrT9Kv_QVGZ_cJ8D13hAn8heIJfCDkXn8-X8CDQ&return_to=https%3A%2F%2Fromwe.zendesk.com%2Fhc%2Frequests%2F7748");
    }
}
