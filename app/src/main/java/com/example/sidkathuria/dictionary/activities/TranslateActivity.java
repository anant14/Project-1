package com.example.sidkathuria.dictionary.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sidkathuria.dictionary.R;

public class TranslateActivity extends AppCompatActivity {
EditText etField1;TextView tvField2;Button btnTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);

        etField1 = (EditText)findViewById(R.id.etField1);
        tvField2 = (TextView)findViewById(R.id.tvField2);

        btnTranslate = (Button)findViewById(R.id.btnTranslate);
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
