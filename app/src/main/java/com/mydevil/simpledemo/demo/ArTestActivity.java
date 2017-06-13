package com.mydevil.simpledemo.demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.mydevil.simpledemo.R;

public class ArTestActivity extends AppCompatActivity {
    private TextView mTextView1;
    private TextView mTextView2;

    public static void startArTestActivity(Context context){
        context.startActivity(new Intent(context,ArTestActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar_test);
        initView();
    }

    private void initView() {

        mTextView1 = (TextView) findViewById(R.id.tv_test);
        String string = getResources().getString(R.string.ar_test_text, "1235546");
        mTextView1.setText(string);
        mTextView2 = (TextView) findViewById(R.id.tv2_test);
        mTextView2.setText(getResources().getString(R.string.buy_more_to_enjoy_free_express_k252,"56566565"));
    }
}
