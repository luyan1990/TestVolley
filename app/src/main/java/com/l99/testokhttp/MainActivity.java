package com.l99.testokhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.l99.testokhttp.bean.NationalPlayerBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<NationalPlayerBean> visitor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
