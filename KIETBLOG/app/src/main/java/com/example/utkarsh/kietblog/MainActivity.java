package com.example.utkarsh.kietblog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton loginbtn,createbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbtn=(ImageButton)findViewById(R.id.imageButton);
        createbtn=(ImageButton)findViewById(R.id.imageButton2);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lint = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(lint);
            }
        });
    }
}
