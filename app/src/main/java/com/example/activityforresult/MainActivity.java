package com.example.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btnP, btnS, btnM, btnD;
    Button btnAC, btnE, btnC;
    double num1, num2 = 0, x;
    String st;
    int op = 1;
    String strStart,anotherStart;
    TextView tv;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        btnP = (Button) findViewById(R.id.btnP);
        btnS = (Button) findViewById(R.id.btnS);
        btnM = (Button) findViewById(R.id.btnM);
        btnD = (Button) findViewById(R.id.btnD);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnE = (Button) findViewById(R.id.btnE);
        btnC = (Button) findViewById(R.id.btnC);
        tv= (TextView) findViewById(R.id.tv);
    }

    public void Plus(View view) {
        if ((!et.getText().toString().equals("")) || (!et.getText().toString().equals(".")) || (!et.getText().toString().equals("-")) || (!et.getText().toString().equals("-.")) || (!et.getText().toString().equals(".-"))) {
            String word = et.getText().toString();
            num2 = Double.parseDouble(word);
            et.setText("");
            switch (op) {
                case 1:
                    num1 = num1 + num2;
                    break;
                case 2:
                    num1 = num1 - num2;
                    break;
                case 3:
                    num1 = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        Toast.makeText(this, "error 0", Toast.LENGTH_SHORT).show();
                    } else {
                        num1 = num1 / num2;
                    }
                    break;
            }
            st = Double.toString(num1);
            et.setHint(st);
        } else {
            Toast.makeText(this, "Input unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 1;
    }

    public void Sub(View view) {
        if ((!et.getText().toString().equals("")) || (!et.getText().toString().equals(".")) || (!et.getText().toString().equals("-")) || (!et.getText().toString().equals("-.")) || (!et.getText().toString().equals(".-"))) {
            String word = et.getText().toString();
            num2 = Double.parseDouble(word);
            et.setText("");
            switch (op) {
                case 1:
                    num1 = num1 + num2;
                    break;
                case 2:
                    num1 = num1 - num2;
                    break;
                case 3:
                    num1 = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        Toast.makeText(this, "error 0", Toast.LENGTH_SHORT).show();
                    } else {
                        num1 = num1 / num2;
                    }
                    break;
            }
            st = Double.toString(num1);
            et.setHint(st);
        } else {
            Toast.makeText(this, "Input unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 2;
    }

    public void Multi(View view) {
        if ((!et.getText().toString().equals("")) || (!et.getText().toString().equals(".")) || (!et.getText().toString().equals("-")) || (!et.getText().toString().equals("-.")) || (!et.getText().toString().equals(".-"))) {
            String word = et.getText().toString();
            num2 = Double.parseDouble(word);
            et.setText("");
            switch (op) {
                case 1:
                    num1 = num1 + num2;
                    break;
                case 2:
                    num1 = num1 - num2;
                    break;
                case 3:
                    num1 = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        Toast.makeText(this, "error 0", Toast.LENGTH_SHORT).show();
                    } else {
                        num1 = num1 / num2;
                    }
                    break;
            }
            st = Double.toString(num1);
            et.setHint(st);
        } else {
            Toast.makeText(this, "Input unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 3;
    }

    public void Divi(View view) {
        if ((!et.getText().toString().equals("")) || (!et.getText().toString().equals(".")) || (!et.getText().toString().equals("-")) || (!et.getText().toString().equals("-.")) || (!et.getText().toString().equals(".-"))) {
            String word = et.getText().toString();
            num2 = Double.parseDouble(word);
            et.setText("");
            switch (op) {
                case 1:
                    num1 = num1 + num2;
                    break;
                case 2:
                    num1 = num1 - num2;
                    break;
                case 3:
                    num1 = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        Toast.makeText(this, "error 0", Toast.LENGTH_SHORT).show();
                    } else {
                        num1 = num1 / num2;
                    }
                    break;
            }
            st = Double.toString(num1);
            et.setHint(st);
        } else {
            Toast.makeText(this, "Input unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 4;
    }

    public void AC(View view) {
        et.setText("");
        num1 = 0;
        num2 = 0;
        et.setHint("");
    }

    public void Equal(View view) {
        if ((!et.getText().toString().equals("")) || (!et.getText().toString().equals(".")) || (!et.getText().toString().equals("-")) || (!et.getText().toString().equals("-.")) || (!et.getText().toString().equals(".-"))) {
            String word = et.getText().toString();
            num2 = Double.parseDouble(word);
            et.setText("");
            switch (op) {
                case 1:
                    num1 = num1 + num2;
                    break;
                case 2:
                    num1 = num1 - num2;
                    break;
                case 3:
                    num1 = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        Toast.makeText(this, "error 0", Toast.LENGTH_SHORT).show();
                    } else {
                        num1 = num1 / num2;
                    }
                    break;
            }
            st = Double.toString(num1);
            et.setHint(st);
        } else {
            Toast.makeText(this, "Input unavailable", Toast.LENGTH_SHORT).show();
        }
        x = num1;
        op = 1;
        num2 = num1 = 0;
    }

    public void Credit(View view) {
        Intent t=new Intent (this,SecondActivity.class);
        if (num1==0){
            st = Double.toString(x);
            t.putExtra("sum",st);
        }
        else{
            st = Double.toString(num1);
            t.putExtra("sum",st);
        }
        startActivityForResult(t,1);
    }

    @Override
    protected void onActivityResult(int rqCode, int rsCode, Intent data_back) {
        super.onActivityResult(rqCode, rsCode, data_back);
        if (data_back!=null){
            strStart = data_back.getStringExtra("s");
            anotherStart = data_back.getStringExtra("a");
            et.setText(strStart);
            tv.setText(anotherStart);
        }
    }
}
