package com.example.sq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView station1, station2, station3, station4, station5, station6, station7;
    ImageView task_11, task_12, task_13, task_21, task_22, task_23, task_31, task_32, task_33, task_41, task_42, task_43, task_51, task_52, task_53, task_61, task_62, task_63;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!Tools.LOAD) {
            SharedPreferences savedData = getSharedPreferences("SavedData", MODE_PRIVATE);
            Tools.NEXT_STATION = savedData.getInt("nextStation", Tools.NEXT_STATION);
            Tools.STATIONS[0] = savedData.getBoolean("Station0", Tools.STATIONS[0]);
            Tools.STATIONS[1] = savedData.getBoolean("Station1", Tools.STATIONS[1]);
            Tools.STATIONS[2] = savedData.getBoolean("Station2", Tools.STATIONS[2]);
            Tools.STATIONS[3] = savedData.getBoolean("Station3", Tools.STATIONS[3]);
            Tools.STATIONS[4] = savedData.getBoolean("Station4", Tools.STATIONS[4]);
            Tools.STATIONS[5] = savedData.getBoolean("Station5", Tools.STATIONS[5]);
            Tools.STATIONS[6] = savedData.getBoolean("Station6", Tools.STATIONS[6]);
            Tools.TASKS[0] = savedData.getBoolean("Task0", false);
            Tools.TASKS[1] = savedData.getBoolean("Task1", false);
            Tools.TASKS[2] = savedData.getBoolean("Task2", false);
            Tools.TASKS[3] = savedData.getBoolean("Task3", false);
            Tools.TASKS[4] = savedData.getBoolean("Task4", false);
            Tools.TASKS[5] = savedData.getBoolean("Task5", false);
            Tools.TASKS[6] = savedData.getBoolean("Task6", false);
            Tools.TASKS[7] = savedData.getBoolean("Task7", false);
            Tools.TASKS[8] = savedData.getBoolean("Task8", false);
            Tools.TASKS[9] = savedData.getBoolean("Task9", false);
            Tools.TASKS[10] = savedData.getBoolean("Task10", false);
            Tools.TASKS[11] = savedData.getBoolean("Task11", false);
            Tools.TASKS[12] = savedData.getBoolean("Task12", false);
            Tools.TASKS[13] = savedData.getBoolean("Task13", false);
            Tools.TASKS[14] = savedData.getBoolean("Task14", false);
            Tools.TASKS[15] = savedData.getBoolean("Task15", false);
            Tools.TASKS[16] = savedData.getBoolean("Task16", false);
            Tools.TASKS[17] = savedData.getBoolean("Task17", false);
            Tools.TASKS[18] = savedData.getBoolean("Task18", false);
            Tools.TASKS[19] = savedData.getBoolean("Task19", false);
            Tools.TASKS[20] = savedData.getBoolean("Task20", false);
            Tools.TASKS[21] = savedData.getBoolean("Task21", false);
            Tools.TASKS[22] = savedData.getBoolean("Task22", false);
            Tools.TASKS[23] = savedData.getBoolean("Task23", false);
            Tools.TASKS[24] = savedData.getBoolean("Task24", false);
            Tools.TASKS[25] = savedData.getBoolean("Task25", false);
            Tools.TASKS[26] = savedData.getBoolean("Task26", false);
            Tools.LOAD = true;
        }

        station1 = findViewById(R.id.station1);
        station2 = findViewById(R.id.station2);
        station3 = findViewById(R.id.station3);
        station4 = findViewById(R.id.station4);
        station5 = findViewById(R.id.station5);
        station6 = findViewById(R.id.station6);
        station7 = findViewById(R.id.station7);
        task_11 = findViewById(R.id.task_11);
        task_12 = findViewById(R.id.task_12);
        task_13 = findViewById(R.id.task_13);
        task_21 = findViewById(R.id.task_21);
        task_22 = findViewById(R.id.task_22);
        task_23 = findViewById(R.id.task_23);
        task_31 = findViewById(R.id.task_31);
        task_32 = findViewById(R.id.task_32);
        task_33 = findViewById(R.id.task_33);
        task_41 = findViewById(R.id.task_41);
        task_42 = findViewById(R.id.task_42);
        task_43 = findViewById(R.id.task_43);
        task_51 = findViewById(R.id.task_51);
        task_52 = findViewById(R.id.task_52);
        task_53 = findViewById(R.id.task_53);
        task_61 = findViewById(R.id.task_61);
        task_62 = findViewById(R.id.task_62);
        task_63 = findViewById(R.id.task_63);

        if (Tools.NEXT_STATION >= 70) {

            station7.setBackgroundResource(R.drawable.station_sq);
        }
        if (Tools.NEXT_STATION >= 60) {
            station6.setBackgroundResource(R.drawable.station6);
        }
        if (Tools.NEXT_STATION >= 63) {
            task_63.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 62) {
            task_62.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 61) {
            task_61.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 50) {
            station5.setBackgroundResource(R.drawable.station5);
        }
        if (Tools.NEXT_STATION >= 53) {
            task_53.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 52) {
            task_52.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 51) {
            task_51.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 40) {
            station4.setBackgroundResource(R.drawable.station4);
        }
        if (Tools.NEXT_STATION >= 43) {
            task_43.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 42) {
            task_42.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 41) {
            task_41.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 30) {
            station3.setBackgroundResource(R.drawable.station3);
        }
        if (Tools.NEXT_STATION >= 33) {
            task_33.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 32) {
            task_32.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 31) {
            task_31.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 20) {
            station2.setBackgroundResource(R.drawable.station2);
        }
        if (Tools.NEXT_STATION >= 23) {
            task_23.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 22) {
            task_22.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 21) {
            task_21.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 10) {
            station1.setBackgroundResource(R.drawable.station1);
        }
        if (Tools.NEXT_STATION >= 13) {
            task_13.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 12) {
            task_12.setBackgroundResource(R.drawable.task);
        }
        if (Tools.NEXT_STATION >= 11) {
            task_11.setBackgroundResource(R.drawable.task);
        }
    }
    public void onStationClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.station1:
                if (Tools.NEXT_STATION >= 10) {
                    if (Tools.STUDY == false) {
                        intent = new Intent(MainActivity.this, Tips.class);
                        startActivity(intent);
                        finish();
                    }
                    else {
                        intent = new Intent(MainActivity.this, Station_1.class);
                        startActivity(intent);
                        finish();
                    }
                }
                break;
            case R.id.task_11:
                if (Tools.NEXT_STATION >= 11) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 1);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_12:
                if (Tools.NEXT_STATION >= 12) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 2);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_13:
                if (Tools.NEXT_STATION >= 13) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 3);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.station2:
                if (Tools.NEXT_STATION >= 20) {
                    intent = new Intent(MainActivity.this, Station_2.class);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_21:
                if (Tools.NEXT_STATION >= 21) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 4);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_22:
                if (Tools.NEXT_STATION >= 22) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 5);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_23:
                if (Tools.NEXT_STATION >= 23) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 6);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.station3:
                if (Tools.NEXT_STATION >= 30) {
                    intent = new Intent(MainActivity.this, Station_3.class);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_31:
                if (Tools.NEXT_STATION >= 31) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 7);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_32:
                if (Tools.NEXT_STATION >= 32) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 8);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_33:
                if (Tools.NEXT_STATION >= 33) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 9);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.station4:
                if (Tools.NEXT_STATION >= 40) {
                    intent = new Intent(MainActivity.this, Station_4.class);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_41:
                if (Tools.NEXT_STATION >= 41) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 10);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_42:
                if (Tools.NEXT_STATION >= 42) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 11);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_43:
                if (Tools.NEXT_STATION >= 43) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 12);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.station5:
                if (Tools.NEXT_STATION >= 50) {
                    intent = new Intent(MainActivity.this, Station_5.class);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_51:
                if (Tools.NEXT_STATION >= 51) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 13);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_52:
                if (Tools.NEXT_STATION >= 52) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 14);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_53:
                if (Tools.NEXT_STATION >= 53) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 15);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.station6:
                if (Tools.NEXT_STATION >= 60) {
                    intent = new Intent(MainActivity.this, Station_6.class);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_61:
                if (Tools.NEXT_STATION >= 61) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 16);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_62:
                if (Tools.NEXT_STATION >= 62) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 17);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.task_63:
                if (Tools.NEXT_STATION >= 63) {
                    intent = new Intent(MainActivity.this, Task.class);
                    intent.putExtra("task", 18);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.station7:
                if (Tools.NEXT_STATION >= 70) {
                    intent = new Intent(MainActivity.this, Station_7.class);
                    startActivity(intent);
                    finish();
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SharedPreferences savedData = getSharedPreferences("SavedData", MODE_PRIVATE);
        SharedPreferences.Editor editor = savedData.edit();
        editor.putInt("nextStation", Tools.NEXT_STATION);
        editor.putBoolean("Station0", Tools.STATIONS[0]);
        editor.putBoolean("Station1", Tools.STATIONS[1]);
        editor.putBoolean("Station2", Tools.STATIONS[2]);
        editor.putBoolean("Station3", Tools.STATIONS[3]);
        editor.putBoolean("Station4", Tools.STATIONS[4]);
        editor.putBoolean("Station5", Tools.STATIONS[5]);
        editor.putBoolean("Station6", Tools.STATIONS[6]);
        editor.putBoolean("Task0", Tools.TASKS[0]);
        editor.putBoolean("Task1", Tools.TASKS[1]);
        editor.putBoolean("Task2", Tools.TASKS[2]);
        editor.putBoolean("Task3", Tools.TASKS[3]);
        editor.putBoolean("Task4", Tools.TASKS[4]);
        editor.putBoolean("Task5", Tools.TASKS[5]);
        editor.putBoolean("Task6", Tools.TASKS[6]);
        editor.putBoolean("Task7", Tools.TASKS[7]);
        editor.putBoolean("Task8", Tools.TASKS[8]);
        editor.putBoolean("Task9", Tools.TASKS[9]);
        editor.putBoolean("Task10", Tools.TASKS[10]);
        editor.putBoolean("Task11", Tools.TASKS[11]);
        editor.putBoolean("Task12", Tools.TASKS[12]);
        editor.putBoolean("Task13", Tools.TASKS[13]);
        editor.putBoolean("Task14", Tools.TASKS[14]);
        editor.putBoolean("Task15", Tools.TASKS[15]);
        editor.putBoolean("Task16", Tools.TASKS[16]);
        editor.putBoolean("Task17", Tools.TASKS[17]);
        editor.putBoolean("Task18", Tools.TASKS[18]);
        editor.putBoolean("Task19", Tools.TASKS[19]);
        editor.putBoolean("Task20", Tools.TASKS[20]);
        editor.putBoolean("Task21", Tools.TASKS[21]);
        editor.putBoolean("Task22", Tools.TASKS[22]);
        editor.putBoolean("Task23", Tools.TASKS[23]);
        editor.putBoolean("Task24", Tools.TASKS[24]);
        editor.putBoolean("Task25", Tools.TASKS[25]);
        editor.putBoolean("Task26", Tools.TASKS[26]);
        editor.commit();
    }
}