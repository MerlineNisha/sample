package com.mydearmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class Customer_login extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_customer_login);
       b1=findViewById(R.id.b1);
       b1.setOnClickListener(view ->{
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });

    }
}