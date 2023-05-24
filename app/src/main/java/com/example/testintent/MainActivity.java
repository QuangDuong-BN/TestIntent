package com.example.testintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    double ketqua;
    Button buttonSend;
    TextInputEditText texta;
    TextInputEditText textb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        texta = findViewById(R.id.textinput_a);
        textb = findViewById(R.id.textinput_b);

        buttonSend = (Button) findViewById(R.id.sendData);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(texta.getText().toString());
                int b = Integer.parseInt(textb.getText().toString());
                ketqua = (double) (-b / a);
                //ketqua = ketqua - Math.floor(ketqua);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("ketqua", ketqua);
                startActivity(intent);
            }
        });


    }
}