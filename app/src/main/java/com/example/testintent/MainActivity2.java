package com.example.testintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {
    TextInputEditText textInputketqua;
    Button mbuttonCallBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textInputketqua = findViewById(R.id.textinput_ketQua);
        Intent intent = getIntent();
        Double Ketqua = intent.getDoubleExtra("ketqua", 0);
        textInputketqua.setText(String.valueOf(Ketqua));

        mbuttonCallBack=findViewById(R.id.button_back);
        mbuttonCallBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}