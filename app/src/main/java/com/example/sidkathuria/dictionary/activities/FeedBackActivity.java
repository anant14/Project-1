package com.example.sidkathuria.dictionary.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sidkathuria.dictionary.R;

public class FeedBackActivity extends AppCompatActivity {
Button btnFeedBackSubmit;EditText etFeedBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        etFeedBack = (EditText)findViewById(R.id.etFeedBack);
        btnFeedBackSubmit = (Button)findViewById(R.id.btnFeedBackSubmit);
        btnFeedBackSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeedBackActivity.this, "Feedback is Submitted.Thank You For Your Time.", Toast.LENGTH_SHORT).show();
etFeedBack.setText("");
            }
        });

    }
}
