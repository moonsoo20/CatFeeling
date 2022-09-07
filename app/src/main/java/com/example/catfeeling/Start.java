package com.example.catfeeling;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class Start extends AppCompatActivity {
    public static final int sub = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button StartButton = (Button)findViewById(R.id.StartButton);
        StartButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivityForResult(intent,sub);//mainactivity2 창띄우기
            }
        });
    }
}