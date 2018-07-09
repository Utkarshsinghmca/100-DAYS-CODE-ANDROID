package com.example.utkarsh.result;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void avgfun(View v)
    {
        EditText a = (EditText)findViewById(R.id.editText);
        EditText b = (EditText)findViewById(R.id.editText2);
        EditText c = (EditText)findViewById(R.id.editText3);
        EditText d = (EditText)findViewById(R.id.editText4);
        EditText e = (EditText)findViewById(R.id.editText5);
        TextView t = (TextView)findViewById(R.id.textView);

        Button btn = (Button)findViewById(R.id.button);
        int num1 =Integer.parseInt(a.getText().toString());
        int num2 =Integer.parseInt(b.getText().toString());
        int num3 =Integer.parseInt(c.getText().toString());
        int num4 =Integer.parseInt(d.getText().toString());
        int num5 =Integer.parseInt(e.getText().toString());

float avg = (num1 +num2 +num3 +num4 +num5)/5;
t.setText(Float.toString(avg));
    }




}
