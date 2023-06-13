package com.example.sq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Station_7 extends AppCompatActivity {

    ImageView back;
    AppCompatButton go;
    TextView info, which_station;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.station_2);
        back = findViewById(R.id.backButton);
        info = findViewById(R.id.text_station_2);
        go = findViewById(R.id.btn);
        go.setTextSize(35);
        go.setText(R.string.go);
        info.setText(R.string.station7);
        which_station = findViewById(R.id.which_station_2);
        which_station.setText(R.string.fin);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
    //Checking on Go button pressing
    public void onBtnClick(View v) {
        Intent intent = new Intent(Station_7.this, Final_task.class);
        intent.putExtra("task", 1);
        startActivity(intent);
        finish();
    }
    //Checking on Back button pressing
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Station_7.this, MainActivity.class);
        startActivity(intent);

        finish();
    }
}