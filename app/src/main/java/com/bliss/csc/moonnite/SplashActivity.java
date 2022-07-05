package com.bliss.csc.moonnite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {
    TextView Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //Title
        Title = findViewById(R.id.Title);
        LottieAnimationView anim = (LottieAnimationView)findViewById(R.id.splash);

        anim.playAnimation();


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}