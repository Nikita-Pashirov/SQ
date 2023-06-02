package com.example.sq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Final_task extends AppCompatActivity {
    TextView task_text;
    ImageView back;
    AppCompatButton ans1, ans2, ans3, ans4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task);
        back = findViewById(R.id.backButton);
        task_text = findViewById(R.id.task_text);

        int which_task = getIntent().getIntExtra("task", 1);
        switch (which_task) {
            case 3:
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
            case 7:
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
            case 2:
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
            case 6:
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
            case 1:
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
            case 4:
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
            case 8:
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
            case 5:
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
            case 10:
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
            case 20:
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
            case 17:
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
            case 9:
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
            case 14:
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
            case 18:
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
            case 25:
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
            case 19:
                task_text.setText(R.string.task14);
                ans3 = findViewById(R.id.ans_1);
                ans1 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task14_correct_ans);
                ans2.setText(R.string.task14_uncorrect_ans_1);
                ans3.setText(R.string.task14_uncorrect_ans_2);
                ans4.setText(R.string.task14_uncorrect_ans_3);
                break;
            case 15:
                task_text.setText(R.string.task55);
                ans2 = findViewById(R.id.ans_1);
                ans3 = findViewById(R.id.ans_2);
                ans4 = findViewById(R.id.ans_3);
                ans1 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task55_correct_ans);
                ans2.setText(R.string.task55_uncorrect_ans_1);
                ans3.setText(R.string.task55_uncorrect_ans_2);
                ans4.setText(R.string.task55_uncorrect_ans_3);
                break;
            case 24:
                task_text.setText(R.string.task24);
                ans2 = findViewById(R.id.ans_1);
                ans3 = findViewById(R.id.ans_2);
                ans1 = findViewById(R.id.ans_3);
                ans4 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task24_correct_ans);
                ans2.setText(R.string.task24_uncorrect_ans_1);
                ans3.setText(R.string.task24_uncorrect_ans_2);
                ans4.setText(R.string.task24_uncorrect_ans_3);
                break;
            case 22:
                task_text.setText(R.string.task34);
                ans4 = findViewById(R.id.ans_1);
                ans3 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans1 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task34_correct_ans);
                ans2.setText(R.string.task34_uncorrect_ans_1);
                ans3.setText(R.string.task34_uncorrect_ans_2);
                ans4.setText(R.string.task34_uncorrect_ans_3);
                break;
            case 23:
                task_text.setText(R.string.task44);
                ans4 = findViewById(R.id.ans_1);
                ans3 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans1 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task44_correct_ans);
                ans2.setText(R.string.task44_uncorrect_ans_1);
                ans3.setText(R.string.task44_uncorrect_ans_2);
                ans4.setText(R.string.task44_uncorrect_ans_3);
                break;
            case 26:
                task_text.setText(R.string.task54);
                ans4 = findViewById(R.id.ans_1);
                ans1 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans3 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task54_correct_ans);
                ans2.setText(R.string.task54_uncorrect_ans_1);
                ans3.setText(R.string.task54_uncorrect_ans_2);
                ans4.setText(R.string.task54_uncorrect_ans_3);
                break;
            case 21:
                task_text.setText(R.string.task64);
                ans4 = findViewById(R.id.ans_1);
                ans3 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans1 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task64_correct_ans);
                ans2.setText(R.string.task64_uncorrect_ans_1);
                ans3.setText(R.string.task64_uncorrect_ans_2);
                ans4.setText(R.string.task64_uncorrect_ans_3);
                break;
            case 13:
                task_text.setText(R.string.task65);
                ans4 = findViewById(R.id.ans_1);
                ans3 = findViewById(R.id.ans_2);
                ans2 = findViewById(R.id.ans_3);
                ans1 = findViewById(R.id.ans_4);
                ans1.setText(R.string.task65_correct_ans);
                ans2.setText(R.string.task65_uncorrect_ans_1);
                ans3.setText(R.string.task65_uncorrect_ans_2);
                ans4.setText(R.string.task65_uncorrect_ans_3);
                break;
        };

    }
    public void onAnsClick(View v) {
        if (ans1.getId() == v.getId())
            correctPressed();
        else
            uncorrectPressed();
    }
    @Override
    public void onBackPressed() {
        int which_task = getIntent().getIntExtra("task", 1);
        Intent intent = new Intent(Final_task.this, Final_task.class);
        intent.putExtra("task", which_task);


        startActivity(intent);
        finish();
    }
    void colculateState () {
        int which_task = getIntent().getIntExtra("task", 1);
        if (Tools.TASKS[which_task] == false) {
            if(which_task % 3 == 0)
                Tools.NEXT_STATION += 6;
            Tools.NEXT_STATION += 1;
            Tools.TASKS[which_task] = true;
        }

    }
    void uncorrectPressed() {
        Toast.makeText(this, "К сожалению Вы ответили неправильно.", Toast.LENGTH_SHORT).show();
        int which_task = getIntent().getIntExtra("task", 1);
        Intent intent = new Intent(Final_task.this, Final_task.class);
        intent.putExtra("task", which_task);


        startActivity(intent);
        finish();
    }
    void correctPressed() {
        Toast.makeText(this, "Поздравляю! Вы дали верный ответ!", Toast.LENGTH_SHORT).show();
        colculateState();
        int which_task = getIntent().getIntExtra("task", 1);
        if (which_task < 26) {
            Intent intent = new Intent(Final_task.this, Final_task.class);
            intent.putExtra("task", which_task + 1);
            startActivity(intent);
            finish();
        }
        else {
            Intent intent = new Intent(Final_task.this, Finish.class);
            startActivity(intent);
            finish();
        }
    }
}