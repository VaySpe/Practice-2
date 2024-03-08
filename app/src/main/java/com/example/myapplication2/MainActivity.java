package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private EditText etFullName;
    private EditText etGroupNumber;
    private EditText etAge;
    private EditText etPracticeGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");

        etFullName = findViewById(R.id.etFullName);
        etGroupNumber = findViewById(R.id.etGroupNumber);
        etAge = findViewById(R.id.etAge);
        etPracticeGrade = findViewById(R.id.etPracticeGrade);

        Button btnDeclarative = findViewById(R.id.btnDeclarative);
        Button btnProgrammatic = findViewById(R.id.btnProgrammatic);

        btnDeclarative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход с передачей данных
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                sendData(intent);
                startActivity(intent);
            }
        });

        btnProgrammatic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Переход с передачей данных
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                sendData(intent);
                startActivity(intent);
            }
        });
    }

    // Метод для передачи данных в Intent
    private void sendData(Intent intent) {
        String fullName = etFullName.getText().toString();
        String groupNumber = etGroupNumber.getText().toString();
        String ageText = etAge.getText().toString();
        String practiceGradeText = etPracticeGrade.getText().toString();

        // Проверка на пустоту полей
        if (!fullName.isEmpty()) {
            intent.putExtra("fullName", fullName);
        }

        if (!groupNumber.isEmpty()) {
            intent.putExtra("groupNumber", groupNumber);
        }

        if (!ageText.isEmpty()) {
            int age = Integer.parseInt(ageText);
            intent.putExtra("age", age);
        }

        if (!practiceGradeText.isEmpty()) {
            float practiceGrade = Float.parseFloat(practiceGradeText);
            intent.putExtra("practiceGrade", practiceGrade);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
