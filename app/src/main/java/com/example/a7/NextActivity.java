package com.example.a7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Button export_btn=findViewById(R.id.export);

        TextView rezult=findViewById(R.id.rez);

        Intent intent=getIntent();
        String velues=intent.getStringExtra("rezult:");

        rezult.setText(velues);
        export_btn.setOnClickListener(view -> {
                finish();
        });

    }
}