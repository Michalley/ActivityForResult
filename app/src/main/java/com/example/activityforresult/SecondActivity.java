package com.example.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.xml.transform.Result;

public class SecondActivity extends AppCompatActivity {

    TextView tv;
    Button btnb;
    Intent gi;
    String ssumm;
    double sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.tv);
        btnb=findViewById(R.id.btnb);
        gi=getIntent();
        ssumm=gi.getStringExtra("sum");
        sum= Double.parseDouble(ssumm);
        tv.setText(ssumm);
    }
    public void Back(View view) {
        Intent back=new Intent();
        back.putExtra("s", sum);
        setResult(RESULT_OK, back);
        finish();
    }
}
