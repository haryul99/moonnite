package com.bliss.csc.moonnite;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
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


        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd");
        title.setText(dateFormat.format(date));
        imageView.setColorFilter(Color.parseColor("#fffff2"));
    }
}