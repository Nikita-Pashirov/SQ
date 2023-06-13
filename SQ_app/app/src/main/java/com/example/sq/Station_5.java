package com.example.sq;

import static com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.SCALE_TYPE_CENTER_CROP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class Station_5 extends AppCompatActivity {

    ImageView back;
    TextView info, which_station;
    SubsamplingScaleImageView photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_1);
        back = findViewById(R.id.backButton);
        info = findViewById(R.id.text_station_1);
        photo = findViewById(R.id.img_station_1);
        photo.setImage(ImageSource.resource(R.drawable.librery));
        photo.setMinimumScaleType(SCALE_TYPE_CENTER_CROP);
        info.setText(R.string.station5);
        which_station = findViewById(R.id.which_station);
        which_station.setText(R.string.librery);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
    //Checking on Back button pressing
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Station_5.this, MainActivity.class);
        if (Tools.STATIONS[4] == false) {
            Tools.NEXT_STATION += 1;
            Tools.STATIONS[4] = true;
        }
        startActivity(intent);

        finish();
    }
}