package com.mydearmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Firstpage extends AppCompatActivity {
    Button Customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_firstpage);
        ImageView im =(ImageView) findViewById(R.id.img1);
        Animation anim = new AlphaAnimation(0.0f,1.00f);
        anim.setDuration(90);
        anim.setStartOffset(200);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        im.startAnimation(anim);
        Customer=findViewById(R.id.b1);
        Customer.setOnClickListener(view ->{
            Intent intent = new Intent(this,login.class);
            startActivity(intent);

        });

    }
}