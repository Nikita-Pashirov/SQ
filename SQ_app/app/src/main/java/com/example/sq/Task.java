package com.example.sq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Task extends AppCompatActivity {
    TextView task_text;
    ImageView back;
    AppCompatButton ans1, ans2, ans3, ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task);
        back = findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        task_text = findViewById(R.id.task_text);
        int which_task = getIntent().getIntExtra("task", 1);
        //Switch_case with tasks
        switch (which_task) {
            case 1:
                task_text.setText(R.string.task11);
                ans4 = findViewById(R.id.ans_1);
                ans1 = findViewById(R.id.ans_2);
                ans3 = findViewById(R.id.ans_3);
                ans2 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task11_correct_ans);
                ans2.setText(R.string.task11_uncorrect_ans_1);
                ans3.setText(R.string.task11_uncorrect_ans_2);
                ans4.setText(R.string.task11_uncorrect_ans_3);
                break;
            case 2:
                task_text.setText(R.string.task12);
                ans3 = findViewById(R.id.ans_1);
                ans2 = findViewById(R.id.ans_2);
                ans1 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task12_correct_ans);
                ans2.setText(R.string.task12_uncorrect_ans_1);
                ans3.setText(R.string.task12_uncorrect_ans_2);
                ans4.setText(R.string.task12_uncorrect_ans_3);
                break;
            case 3:
                task_text.setText(R.string.task13);
                ans3 = findViewById(R.id.ans_1);
                ans2 = findViewById(R.id.ans_2);
                ans1 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task13_correct_ans);
                ans2.setText(R.string.task13_uncorrect_ans_1);
                ans3.setText(R.string.task13_uncorrect_ans_2);
                ans4.setText(R.string.task13_uncorrect_ans_3);
                break;
            case 4:
                task_text.setText(R.string.task21);
                ans1 = findViewById(R.id.ans_1);
                ans2 = findViewById(R.id.ans_2);
                ans3 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task21_correct_ans);
                ans2.setText(R.string.task21_uncorrect_ans_1);
                ans3.setText(R.string.task21_uncorrect_ans_2);
                ans4.setText(R.string.task21_uncorrect_ans_3);
                break;
            case 5:
                task_text.setText(R.string.task22);
                ans4 = findViewById(R.id.ans_1);
                ans3 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans1 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task22_correct_ans);
                ans2.setText(R.string.task22_uncorrect_ans_1);
                ans3.setText(R.string.task22_uncorrect_ans_2);
                ans4.setText(R.string.task22_uncorrect_ans_3);
                break;
            case 6:
                task_text.setText(R.string.task23);
                ans1 = findViewById(R.id.ans_1);
                ans4 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans3 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task23_correct_ans);
                ans2.setText(R.string.task23_uncorrect_ans_1);
                ans3.setText(R.string.task23_uncorrect_ans_2);
                ans4.setText(R.string.task23_uncorrect_ans_3);
                break;
            case 7:
                task_text.setText(R.string.task31);
                ans1 = findViewById(R.id.ans_1);
                ans2 = findViewById(R.id.ans_2);
                ans4 = findViewById(R.id.ans_3);
                ans3 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task31_correct_ans);
                ans2.setText(R.string.task31_uncorrect_ans_1);
                ans3.setText(R.string.task31_uncorrect_ans_2);
                ans4.setText(R.string.task31_uncorrect_ans_3);
                break;
            case 8:
                task_text.setText(R.string.task32);
                ans2 = findViewById(R.id.ans_1);
                ans1 = findViewById(R.id.ans_2);
                ans3 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task32_correct_ans);
                ans2.setText(R.string.task32_uncorrect_ans_1);
                ans3.setText(R.string.task32_uncorrect_ans_2);
                ans4.setText(R.string.task32_uncorrect_ans_3);
                break;
            case 9:
                task_text.setText(R.string.task33);
                ans2 = findViewById(R.id.ans_1);
                ans1 = findViewById(R.id.ans_2);
                ans3 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task33_correct_ans);
                ans2.setText(R.string.task33_uncorrect_ans_1);
                ans3.setText(R.string.task33_uncorrect_ans_2);
                ans4.setText(R.string.task33_uncorrect_ans_3);
                break;
            case 10:
                task_text.setText(R.string.task41);
                ans3 = findViewById(R.id.ans_1);
                ans1 = findViewById(R.id.ans_2);
                ans4 = findViewById(R.id.ans_3);
                ans2 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task41_correct_ans);
                ans2.setText(R.string.task41_uncorrect_ans_1);
                ans3.setText(R.string.task41_uncorrect_ans_2);
                ans4.setText(R.string.task41_uncorrect_ans_3);
                break;
            case 11:
                task_text.setText(R.string.task42);
                ans4 = findViewById(R.id.ans_1);
                ans1 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans3 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task42_correct_ans);
                ans2.setText(R.string.task42_uncorrect_ans_1);
                ans3.setText(R.string.task42_uncorrect_ans_2);
                ans4.setText(R.string.task42_uncorrect_ans_3);
                break;
            case 12:
                task_text.setText(R.string.task43);
                ans1 = findViewById(R.id.ans_1);
                ans2 = findViewById(R.id.ans_2);
                ans4 = findViewById(R.id.ans_3);
                ans3 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task43_correct_ans);
                ans2.setText(R.string.task43_uncorrect_ans_1);
                ans3.setText(R.string.task43_uncorrect_ans_2);
                ans4.setText(R.string.task43_uncorrect_ans_3);
                break;
            case 13:
                task_text.setText(R.string.task51);
                ans2 = findViewById(R.id.ans_1);
                ans4 = findViewById(R.id.ans_2);
                ans3 = findViewById(R.id.ans_3);
                ans1 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task51_correct_ans);
                ans2.setText(R.string.task51_uncorrect_ans_1);
                ans3.setText(R.string.task51_uncorrect_ans_2);
                ans4.setText(R.string.task51_uncorrect_ans_3);
                break;
            case 14:
                task_text.setText(R.string.task52);
                ans2 = findViewById(R.id.ans_1);
                ans3 = findViewById(R.id.ans_2);
                ans1 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task52_correct_ans);
                ans2.setText(R.string.task52_uncorrect_ans_1);
                ans3.setText(R.string.task52_uncorrect_ans_2);
                ans4.setText(R.string.task52_uncorrect_ans_3);
                break;
            case 15:
                task_text.setText(R.string.task53);
                ans4 = findViewById(R.id.ans_1);
                ans1 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans3 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task53_correct_ans);
                ans2.setText(R.string.task53_uncorrect_ans_1);
                ans3.setText(R.string.task53_uncorrect_ans_2);
                ans4.setText(R.string.task53_uncorrect_ans_3);
                break;
            case 16:
                task_text.setText(R.string.task61);
                ans3 = findViewById(R.id.ans_1);
                ans2 = findViewById(R.id.ans_2);
                ans1 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task61_correct_ans);
                ans2.setText(R.string.task61_uncorrect_ans_1);
                ans3.setText(R.string.task61_uncorrect_ans_2);
                ans4.setText(R.string.task61_uncorrect_ans_3);
                break;
            case 17:
                task_text.setText(R.string.task62);
                ans2 = findViewById(R.id.ans_1);
                ans1 = findViewById(R.id.ans_2);
                ans3 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task62_correct_ans);
                ans2.setText(R.string.task62_uncorrect_ans_1);
                ans3.setText(R.string.task62_uncorrect_ans_2);
                ans4.setText(R.string.task62_uncorrect_ans_3);
                break;
            case 18:
                task_text.setText(R.string.task63);
                ans4 = findViewById(R.id.ans_1);
                ans3 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans1 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task63_correct_ans);
                ans2.setText(R.string.task63_uncorrect_ans_1);
                ans3.setText(R.string.task63_uncorrect_ans_2);
                ans4.setText(R.string.task63_uncorrect_ans_3);
                break;
        };
    }
    //Checking on Ans button pressing
    public void onAnsClick(View v) {
        if (ans1.getId() == v.getId())
            correctPressed();
        else
            uncorrectPressed();
    }
    //Checking on Back button pressing
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Task.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    //Calculate helping variables
    void colculateState () {
        int which_task = getIntent().getIntExtra("task", 1);
        if (Tools.TASKS[which_task] == false) {
            if(which_task % 3 == 0)
                Tools.NEXT_STATION += 6;
            Tools.NEXT_STATION += 1;
            Tools.TASKS[which_task] = true;
            SharedPreferences savedData = getSharedPreferences("SavedData", MODE_PRIVATE);
            SharedPreferences.Editor editor = savedData.edit();
            editor.remove("nextStation");
            editor.putInt("nextStation", Tools.NEXT_STATION);
            switch (which_task) {
                case 0:editor.remove("task0"); editor.putBoolean("task0", Tools.TASKS[0]);break;
                case 1:editor.remove("task1"); editor.putBoolean("task1", Tools.TASKS[1]);break;
                case 2:editor.remove("task2"); editor.putBoolean("task2", Tools.TASKS[2]);break;
                case 3:editor.remove("task3"); editor.putBoolean("task3", Tools.TASKS[3]);break;
                case 4:editor.remove("task4"); editor.putBoolean("task4", Tools.TASKS[4]);break;
                case 5:editor.remove("task5");editor.putBoolean("task5", Tools.TASKS[5]);break;
                case 6:editor.remove("task6");editor.putBoolean("task6", Tools.TASKS[6]);break;
                case 7:editor.remove("task7");editor.putBoolean("task7", Tools.TASKS[7]);break;
                case 8:editor.remove("task8");editor.putBoolean("task8", Tools.TASKS[8]);break;
                case 9:editor.remove("task9");editor.putBoolean("task9", Tools.TASKS[9]);break;
                case 10:editor.remove("task10");editor.putBoolean("task10", Tools.TASKS[10]);break;
                case 11:editor.remove("task11");editor.putBoolean("task11", Tools.TASKS[11]);break;
                case 12:editor.remove("task12");editor.putBoolean("task12", Tools.TASKS[12]);break;
                case 13:editor.remove("task13");editor.putBoolean("task13", Tools.TASKS[13]);break;
                case 14:editor.remove("task14");editor.putBoolean("task14", Tools.TASKS[14]);break;
                case 15:editor.remove("task15");editor.putBoolean("task15", Tools.TASKS[15]);break;
                case 16:editor.remove("task16");editor.putBoolean("task16", Tools.TASKS[16]);break;
                case 17:editor.remove("task17");editor.putBoolean("task17", Tools.TASKS[17]);break;
                case 18:editor.remove("task18");editor.putBoolean("task18", Tools.TASKS[18]);break;
                case 19:editor.remove("task19");editor.putBoolean("task19", Tools.TASKS[19]);break;
                case 20:editor.remove("task20"); editor.putBoolean("task20", Tools.TASKS[20]);break;
                case 21:editor.remove("task21"); editor.putBoolean("task21", Tools.TASKS[21]);break;
                case 22:editor.remove("task22"); editor.putBoolean("task22", Tools.TASKS[22]);break;
                case 23:editor.remove("task23"); editor.putBoolean("task23", Tools.TASKS[23]);break;
                case 24:editor.remove("task24");editor.putBoolean("task24", Tools.TASKS[24]);break;
                case 25:editor.remove("task25");editor.putBoolean("task25", Tools.TASKS[25]);break;
                case 26:editor.remove("task26");editor.putBoolean("task26", Tools.TASKS[26]); break;
            }
            editor.commit();
        }

    }
    //Checking if uncorrect ans pressed
    void uncorrectPressed() {
        SharedPreferences savedData = getSharedPreferences("SavedData", MODE_PRIVATE);
        SharedPreferences.Editor editor = savedData.edit();
        Toast.makeText(this, "К сожалению Вы ответили неправильно.", Toast.LENGTH_SHORT).show();
        int which_task = getIntent().getIntExtra("task", 1);
        if (which_task % 3 == 0) {
            Tools.TASKS[which_task] = false;
            Tools.TASKS[which_task - 1] = false;
            Tools.TASKS[which_task - 2] = false;
        }
        if (which_task % 3 == 2){
            Tools.TASKS[which_task] = false;

            Tools.TASKS[which_task - 1] = false;
        }
        if (which_task % 3 == 1) {
            Tools.TASKS[which_task] = false;
        }
        Tools.NEXT_STATION /= 10;
        Tools.NEXT_STATION *= 10;
        Tools.STATIONS[Tools.NEXT_STATION / 10 - 1] = false;
        onBackPressed();
    }
    //Checking if correct ans pressed
    void correctPressed() {
        Toast.makeText(this, "Поздравляю! Вы дали верный ответ!", Toast.LENGTH_SHORT).show();
        colculateState();
        onBackPressed();
    }
}