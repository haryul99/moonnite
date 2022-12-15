package com.bliss.csc.moonnite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
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
        CalendarView calendarView = findViewById(R.id.calendarView);


        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd");
        title.setText(dateFormat.format(date));
        imageView.setColorFilter(Color.parseColor("#fffff2"));

        // 달 사진 선택 시 액티비티 전환
        moonphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CompassActivity.class);
                startActivity(intent);

            }
        });
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                calendarView.getRootView().setVisibility(View.VISIBLE);
//            }
//        });



        // 음력 날짜에 대한 달 사진change
//       if (title < 12.14){
//         moonphoto.setImageResource(getDrawable(R.drawable.m6));
//       };


    }

}