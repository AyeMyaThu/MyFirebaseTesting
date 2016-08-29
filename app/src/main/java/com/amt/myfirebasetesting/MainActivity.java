package com.amt.myfirebasetesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView age,gender,township,job;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        age = (TextView) findViewById(R.id.edtage);
        gender = (TextView) findViewById(R.id.edtgender);
        township = (TextView) findViewById(R.id.edttownship);
        job = (TextView) findViewById(R.id.edtjob);

        next = (Button) findViewById(R.id.btnnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SecondActivity.class);
                i.putExtra("age",age.getText());
                i.putExtra("gender",gender.getText());
                i.putExtra("township",township.getText());
                i.putExtra("job",job.getText());
                startActivity(i);
            }
        });
    }
}
