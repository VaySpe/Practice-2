package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получаем переданные данные
        Intent intent = getIntent();
        String fullName = intent.getStringExtra("fullName");
        String groupNumber = intent.getStringExtra("groupNumber");
        int age = intent.getIntExtra("age", 0);
        float practiceGrade = intent.getFloatExtra("practiceGrade", 0.0f);

        // Отображаем данные
        TextView tvDetails = findViewById(R.id.tvDetails);
        String details = "Full Name: " + fullName + "\n"
                + "Group Number: " + groupNumber + "\n"
                + "Age: " + age + "\n"
                + "Practice Grade: " + practiceGrade;
        tvDetails.setText(details);
    }
}
