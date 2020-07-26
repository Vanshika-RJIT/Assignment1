package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   EditText t1,t2,t3,t4,t5;
   Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.editTextTextPersonName);
        t2=findViewById(R.id.editTextTextEmailAddress);
        t3=findViewById(R.id.editTextPhone);
        t4=findViewById(R.id.editTextAge);
        t5=findViewById(R.id.editTextTextPassword);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("name",t1.getText().toString());
                i.putExtra("email",t2.getText().toString());
                i.putExtra("phone",t3.getText().toString());
                i.putExtra("age",t4.getText().toString());
                i.putExtra("password",t5.getText().toString());
                startActivity(i);
            }
        });

    }
}