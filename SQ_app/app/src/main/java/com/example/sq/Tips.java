package com.example.sq;

import static com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.SCALE_TYPE_CENTER_CROP;
import static com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.SCALE_TYPE_CENTER_INSIDE;
import static com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.SCALE_TYPE_CUSTOM;
import static com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.SCALE_TYPE_START;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.chip.Chip;

public class Tips extends AppCompatActivity {
    ImageView back;
    TextView info, which_station;
    SubsamplingScaleImageView photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips);
        back = findViewById(R.id.backButton);
        info = findViewById(R.id.text_station_1);
        photo = findViewById(R.id.img_station_1);
        photo.setImage(ImageSource.resource(R.drawable.opera__hause_1));
        photo.setMinimumScaleType(SCALE_TYPE_CENTER_CROP);

        info.setText(R.string.station1);
        which_station = findViewById(R.id.which_station);
        which_station.setText(R.string.opera__hause);
        //Making new Thread to wait for 2 sec
        new Thread(new Runnable() {
            @Override
            public void run() {
                wt();
                close();
            }
        }).start();


    }
    //Waiting for Thread
    synchronized void wt() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }

    }
    //Going to first activity
    synchronized void close() {
        Intent intent = new Intent(Tips.this, Station_1.class);
        if (Tools.STUDY == false)
            Tools.STUDY = true;
        startActivity(intent);

        finish();
    }
    //Checking on Back button pressing
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Tips.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}