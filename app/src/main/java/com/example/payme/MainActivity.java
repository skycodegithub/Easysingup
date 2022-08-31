package com.example.payme;

import static java.lang.System.in;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Object textView1 = findViewById(R.id.login);
        View materialButton = findViewById(R.id.click);

        materialButton.setOnClickListener(view -> {

        });
    }
}