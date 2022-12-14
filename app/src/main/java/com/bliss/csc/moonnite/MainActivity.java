package com.bliss.csc.moonnite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.calendar);
        TextView title = findViewById(R.id.date);
        ImageView moonphoto = findViewById(R.id.moonphoto);


        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd");
        title.setText(dateFormat.format(date));
        imageView.setColorFilter(Color.parseColor("#fffff2"));

        // 캘린더 아이콘 선택 시 액티비티 전환
       imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CompassActivity.class);
                startActivity(intent);

            }
        });

       if (dateFormat.format(date) < 12.14){
         moonphoto.setImageResource(getDrawable(R.drawable.m6));
       };



    }
}