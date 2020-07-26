package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        String name=getIntent().getStringExtra("name");
        String email=getIntent().getStringExtra("email");
        String phone=getIntent().getStringExtra("phone");
        String age=getIntent().getStringExtra("age");
        String password=getIntent().getStringExtra("password");
        t1.setText(name);
        t2.setText(email);
        t3.setText(phone);
        t4.setText(age);
        t5.setText(password);


    }
}