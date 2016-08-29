package com.amt.myfirebasetesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ayemyathu on 8/29/16.
 */
public class SecondActivity extends AppCompatActivity {
    TextView name,email,psw,pswagain,nrc;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


    }
}
