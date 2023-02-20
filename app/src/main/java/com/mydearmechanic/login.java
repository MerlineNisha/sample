package com.mydearmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class login extends AppCompatActivity {
    TextView linkTextView;
    TextView registerhere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        TextView tv =(TextView) findViewById(R.id.action_main_hyperlink);
        Animation anim = new AlphaAnimation(0.0f,1.00f);
        anim.setDuration(90);
        anim.setStartOffset(200);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        tv.startAnimation(anim);
        TextView id =(TextView) findViewById(R.id.textView4);
        Animation ani = new AlphaAnimation(0.0f,1.00f);
        anim.setDuration(90);
        anim.setStartOffset(200);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        id.startAnimation(anim);
        linkTextView=findViewById(R.id.action_main_hyperlink);
        registerhere=findViewById(R.id.textView4);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        registerhere.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setOnClickListener(view ->{
            Intent intent = new Intent(this,Customer_login.class);
            startActivity(intent);
        });
        registerhere.setOnClickListener(view ->{
            Intent intent = new Intent(this,customer_registration.class);
            startActivity(intent);
        });

    }
}